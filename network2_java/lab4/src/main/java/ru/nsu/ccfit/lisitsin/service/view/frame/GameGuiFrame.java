package ru.nsu.ccfit.lisitsin.service.view.frame;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;
import ru.nsu.ccfit.lisitsin.service.core.entity.Direction;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;
import ru.nsu.ccfit.lisitsin.service.events.game.GameEventPublisher;
import ru.nsu.ccfit.lisitsin.service.events.game.events.ChangeDirectionEvent;
import ru.nsu.ccfit.lisitsin.service.view.panel.GameFieldPanel;
import ru.nsu.ccfit.lisitsin.service.view.panel.MenuPanel;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Slf4j
@Component
@RequiredArgsConstructor
public class GameGuiFrame extends JFrame {

    private final PropertiesConfig propertiesConfig;

    private final MenuPanel menuPanel;

    private final GameFieldPanel gameFieldPanel;

    private final GameEventPublisher gameEventPublisher;

    private final GameSession gameSession;

    @PostConstruct
    public void init() {
        this.gameFieldPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (gameSession.getGameMode() == GameMode.NONE) {
                    return;
                }
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_W -> sendDirection(Direction.DOWN);
                    case KeyEvent.VK_A -> sendDirection(Direction.LEFT);
                    case KeyEvent.VK_S -> sendDirection(Direction.UP);
                    case KeyEvent.VK_D -> sendDirection(Direction.RIGHT);
                }
            }
        });
        this.gameFieldPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                gameFieldPanel.requestFocusInWindow();
            }
        });
        this.setTitle(propertiesConfig.title());
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JSplitPane gui = new JSplitPane(
                propertiesConfig.width() > propertiesConfig.height()
                        ? JSplitPane.VERTICAL_SPLIT
                        : JSplitPane.HORIZONTAL_SPLIT,
                this.gameFieldPanel,
                this.menuPanel
        );
        gui.setEnabled(false);
        gui.setOrientation(propertiesConfig.width() > propertiesConfig.height()
                ? SwingConstants.VERTICAL
                : SwingConstants.HORIZONTAL
        );
        this.add(gui);
        this.setSize(propertiesConfig.width(), propertiesConfig.height());
    }

    public void run() {
        this.setVisible(true);
    }

    private void sendDirection(Direction direction) {
        gameEventPublisher.publish(new ChangeDirectionEvent(this, direction));
    }

}
