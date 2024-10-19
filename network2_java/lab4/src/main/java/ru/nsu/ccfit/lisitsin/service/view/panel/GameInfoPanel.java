package ru.nsu.ccfit.lisitsin.service.view.panel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;
import ru.nsu.ccfit.lisitsin.service.events.game.GameEventPublisher;
import ru.nsu.ccfit.lisitsin.service.events.game.events.LeaveGameEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

@Component
@RequiredArgsConstructor
public class GameInfoPanel extends JPanel {

    private final GameSession gameSession;

    private final GameEventPublisher gameEventPublisher;

    private JLabel gameNameLabel;

    private JLabel widthLabel;

    private JLabel heightLabel;

    private JLabel maxFoodLabel;

    private JLabel hostPlayerLabel;

    private DefaultTableModel leaderboardModel;

    @PostConstruct
    public void init() {
        String[] leaderboardColumnNames = {"Номер", "Никнейм", "Кол-во очков"};
        Object[][] leaderboardData = {};

        leaderboardModel = new DefaultTableModel(leaderboardData, leaderboardColumnNames);
        JTable leaderboardTable = new JTable(leaderboardModel);
        leaderboardTable.setPreferredScrollableViewportSize(new Dimension(300, 100));
        leaderboardTable.setFillsViewportHeight(true);
        JScrollPane leaderboardScrollPane = new JScrollPane(leaderboardTable);
        leaderboardScrollPane.setBorder(BorderFactory.createTitledBorder("Таблица лидеров"));

        JPanel gameInfoPanel = new JPanel();
        gameInfoPanel.setLayout(new GridLayout(0, 2, 10, 10));

        gameInfoPanel.add(new JLabel("Название:"));
        gameNameLabel = new JLabel("");
        gameInfoPanel.add(gameNameLabel);

        gameInfoPanel.add(new JLabel("Ширина:"));
        widthLabel = new JLabel("");
        gameInfoPanel.add(widthLabel);

        gameInfoPanel.add(new JLabel("Высота:"));
        heightLabel = new JLabel("");
        gameInfoPanel.add(heightLabel);

        gameInfoPanel.add(new JLabel("Макс. еда:"));
        maxFoodLabel = new JLabel("");
        gameInfoPanel.add(maxFoodLabel);

        gameInfoPanel.add(new JLabel("Никнейм ведущего игрока:"));
        hostPlayerLabel = new JLabel("");
        gameInfoPanel.add(hostPlayerLabel);

        gameInfoPanel.setBorder(BorderFactory.createTitledBorder("Информация о текущей игре"));

        JButton exitButton = getExitButton();

        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(leaderboardScrollPane);
        this.add(Box.createVerticalStrut(10));
        this.add(gameInfoPanel);
        this.add(Box.createVerticalStrut(10));
        this.add(exitButton);
    }

    public void updateGameName(String newName) {
        gameNameLabel.setText(newName);
    }

    public void updateWidth(String newWidth) {
        widthLabel.setText(newWidth);
    }

    public void updateHeight(String newHeight) {
        heightLabel.setText(newHeight);
    }

    public void updateMaxFood(String newMaxFood) {
        maxFoodLabel.setText(newMaxFood);
    }

    public void updateHostPlayer(String newHostPlayer) {
        hostPlayerLabel.setText(newHostPlayer);
    }

    public void addPlayer(String nickname, int score) {
        int rowCount = leaderboardModel.getRowCount();
        leaderboardModel.addRow(new Object[]{rowCount + 1, nickname, score});
    }

    public void clear() {
        clearLeaderboard();
        updateGameName("");
        updateWidth("");
        updateHeight("");
        updateMaxFood("");
        updateHostPlayer("");
    }

    public void clearLeaderboard() {
        leaderboardModel.setRowCount(0);
    }

    private JButton getExitButton() {
        JButton exitButton = new JButton("Выйти из игры");
        exitButton.setBackground(Color.RED);
        exitButton.setForeground(Color.WHITE);
        exitButton.setFocusPainted(false);
        exitButton.addActionListener(e -> {
            if (gameSession.getGameMode() == GameMode.NONE) {
                JOptionPane.showMessageDialog(this, "Вы не находитесь в игре в данный момент.");
            } else {
                gameEventPublisher.publish(new LeaveGameEvent(this));
            }
        });
        return exitButton;
    }
}
