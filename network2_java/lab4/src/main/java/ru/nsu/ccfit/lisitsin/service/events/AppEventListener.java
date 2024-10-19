package ru.nsu.ccfit.lisitsin.service.events;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.api.grpc.GrpcServer;
import ru.nsu.ccfit.lisitsin.service.api.grpc.client.GrpcClientToServerClient;
import ru.nsu.ccfit.lisitsin.service.core.error.ServiceException;
import ru.nsu.ccfit.lisitsin.service.core.service.GameFieldService;
import ru.nsu.ccfit.lisitsin.service.core.service.GameInfoService;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;
import ru.nsu.ccfit.lisitsin.service.events.game.events.ChangeDirectionEvent;
import ru.nsu.ccfit.lisitsin.service.events.game.events.JoinGameEvent;
import ru.nsu.ccfit.lisitsin.service.events.game.events.LeaveGameEvent;
import ru.nsu.ccfit.lisitsin.service.events.game.events.NewGameCreateEvent;
import ru.nsu.ccfit.lisitsin.service.view.frame.GameGuiFrame;

import javax.swing.*;
import java.util.Optional;

@Slf4j
@Component
@RequiredArgsConstructor
public class AppEventListener {

    private final GrpcServer grpcServer;

    private final GameGuiFrame gameGuiFrame;

    private final GrpcClientToServerClient client;

    private final GameSession gameSession;

    private final GameInfoService gameInfoService;

    private final GameFieldService gameFieldService;

    @EventListener(ApplicationReadyEvent.class)
    @SneakyThrows
    public void onApplicationReady() {
        gameGuiFrame.run();
        grpcServer.start();
    }

    @EventListener
    public void onCreateNewGame(NewGameCreateEvent newGameCreateEvent) {
        gameSession.setGameMode(GameMode.MASTER);
        Optional<ServiceException> result = client.createGame(
                newGameCreateEvent.getGameName(),
                newGameCreateEvent.getNickname(),
                newGameCreateEvent.getWidth(),
                newGameCreateEvent.getHeight(),
                newGameCreateEvent.getFood()
        );
        if (result.isPresent()) {
            JOptionPane.showMessageDialog(
                    (java.awt.Component) newGameCreateEvent.getSource(),
                    "Ошибка при создании игры:\n" + result.get().getMessage()
            );
            gameSession.setGameMode(GameMode.NONE);
        } else {
            JOptionPane.showMessageDialog(
                    (java.awt.Component) newGameCreateEvent.getSource(),
                    String.format("Игра '%s' создана с размерами %dx%d и макс. едой: %d",
                            newGameCreateEvent.getGameName(),
                            newGameCreateEvent.getWidth(),
                            newGameCreateEvent.getHeight(),
                            newGameCreateEvent.getFood()
                    )
            );
        }
    }

    @EventListener
    public void onJoinGame(JoinGameEvent joinGameEvent) {
        gameSession.setGameMode(GameMode.DEFAULT);
        Optional<ServiceException> result = client.joinGame(
                joinGameEvent.getAddress(),
                joinGameEvent.getNickname()
        );
        if (result.isPresent()) {
            JOptionPane.showMessageDialog(
                    (java.awt.Component) joinGameEvent.getSource(),
                    "Ошибка при присоединении к игре:\n" + result.get().getMessage()
            );
            gameSession.setGameMode(GameMode.NONE);
        } else {
            JOptionPane.showMessageDialog(
                    (java.awt.Component) joinGameEvent.getSource(),
                    "Подключение к игре прошло успешно!"
            );
        }
    }

    @EventListener
    public void onLeaveGame(LeaveGameEvent leaveGameEvent) {
        GameMode oldMode = gameSession.getGameMode();
        gameSession.setGameMode(GameMode.NONE);
        Optional<ServiceException> result = client.leaveGame();
        if (result.isPresent()) {
            JOptionPane.showMessageDialog(
                    (java.awt.Component) leaveGameEvent.getSource(),
                    "Не удалось отключиться от игры:\n" + result.get().getMessage()
            );
            gameSession.setGameMode(oldMode);
            gameInfoService.clear();
        } else {
            gameFieldService.clear();
        }
    }

    @EventListener
    public void onSendDirection(ChangeDirectionEvent changeDirectionEvent) {
        Optional<ServiceException> result = client.sendDirection(changeDirectionEvent.getDirection());
        result.ifPresent(e -> log.error(e.getMessage()));
    }

}
