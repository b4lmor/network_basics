package ru.nsu.ccfit.lisitsin.service.view.panel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.core.error.ServiceException;
import ru.nsu.ccfit.lisitsin.service.core.validation.InputValidator;
import ru.nsu.ccfit.lisitsin.service.events.game.GameEventPublisher;
import ru.nsu.ccfit.lisitsin.service.events.game.events.JoinGameEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GameListPanel extends JPanel {

    private DefaultTableModel gameList;

    private final GameEventPublisher gameEventPublisher;

    private final InputValidator inputValidator;

    @PostConstruct
    public void init() {
        JTable table = getTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                int column = table.columnAtPoint(e.getPoint());

                if (column == 1 && row >= 0 && row < table.getRowCount()) {
                    String address = (String) table.getValueAt(row, column);
                    if (address == null || address.isEmpty()) {
                        return;
                    }
                    StringSelection stringSelection = new StringSelection(address);
                    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                    clipboard.setContents(stringSelection, null);
                    JOptionPane.showMessageDialog(table, "Адрес скопирован: " + address);
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);

        JPanel gameListPanel = getGameDataPanel();

        this.setLayout(new BorderLayout());
        this.add(scrollPane, BorderLayout.CENTER);
        this.add(gameListPanel, BorderLayout.SOUTH);
    }

    private JTable getTable() {
        String[] columnNames = {"Название игры", "Адрес игры", "Кол-во игроков"};
        Object[][] data = {};

         gameList = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(gameList);
        table.setFillsViewportHeight(true);
        return table;
    }

    public void addGame(String gameName, String address, int playerCount) {
        gameList.addRow(new Object[] {gameName, address, playerCount});
    }

    public void clearGameList() {
        gameList.setRowCount(0);
    }

    private JPanel getGameDataPanel() {
        JPanel gameListPanel = new JPanel();
        JLabel addressLabel = new JLabel("Адрес игры:");
        JTextField addressField = new JTextField(10);
        JLabel nicknameLabel = new JLabel("Никнейм:");
        JTextField nicknameField = new JTextField(10);
        JButton connectButton = new JButton("Подключиться");
        connectButton.setBackground(Color.GREEN);
        connectButton.setForeground(Color.WHITE);

        connectButton.addActionListener(e -> {
            Optional<ServiceException> exception = inputValidator.validateNickname(nicknameField.getText());
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateAddress(addressField.getText());
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            gameEventPublisher.publish(new JoinGameEvent(this, addressField.getText(), nicknameField.getText()));
        });

        gameListPanel.add(addressLabel);
        gameListPanel.add(addressField);
        gameListPanel.add(nicknameLabel);
        gameListPanel.add(nicknameField);
        gameListPanel.add(connectButton);
        return gameListPanel;
    }

}
