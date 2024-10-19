package ru.nsu.ccfit.lisitsin.service.view.panel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
@RequiredArgsConstructor
public class MenuPanel extends JTabbedPane {

    private final GameCreatePanel gameCreatePanel;

    private final GameInfoPanel gameInfoPanel;

    private final GameListPanel gameListPanel;

    @PostConstruct
    public void init() {
        this.addTab("Current Game", gameInfoPanel);
        this.addTab("Game List", gameListPanel);
        this.addTab("Create Game", gameCreatePanel);
        this.setSelectedIndex(1);
        this.setFocusable(true);
    }

}
