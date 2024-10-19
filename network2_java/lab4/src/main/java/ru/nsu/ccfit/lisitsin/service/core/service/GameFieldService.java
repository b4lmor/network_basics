package ru.nsu.ccfit.lisitsin.service.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;
import ru.nsu.ccfit.lisitsin.service.core.validation.InputValidator;
import ru.nsu.ccfit.lisitsin.service.view.panel.GameFieldPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Map;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameFieldService {

    private final GameFieldPanel gameFieldPanel;

    private final InputValidator inputValidator;

    private final PropertiesConfig propertiesConfig;

    private final GameSession gameSession;

    public void paint(Map<Point, Color> changed) {
        if (gameSession.getGameMode() != GameMode.NONE) {
            gameFieldPanel.fillSquares(changed);
        } else {
            log.warn("Couldn't paint on the field while player is not in a game");
        }
    }

    public void endGame(int score) {
        gameFieldPanel.clear();
        JOptionPane.showMessageDialog(gameFieldPanel, "Игра окончена. Ваш счёт: %d".formatted(score));
    }

    public void clear() {
        gameFieldPanel.clear();
    }

    public boolean setUnitSize(int width, int height) {
        var exception = inputValidator.validateGameSize(width, height);
        if (exception.isPresent()) {
            JOptionPane.showMessageDialog(gameFieldPanel, exception.get().getMessage());
            return false;
        }
        gameFieldPanel.setUnitSize(Math.min(propertiesConfig.width(), propertiesConfig.height()) / width);
        return true;
    }
}
