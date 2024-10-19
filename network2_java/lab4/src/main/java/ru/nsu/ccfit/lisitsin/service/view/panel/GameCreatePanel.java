package ru.nsu.ccfit.lisitsin.service.view.panel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.core.error.ServiceException;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;
import ru.nsu.ccfit.lisitsin.service.core.validation.InputValidator;
import ru.nsu.ccfit.lisitsin.service.events.game.GameEventPublisher;
import ru.nsu.ccfit.lisitsin.service.events.game.events.NewGameCreateEvent;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class GameCreatePanel extends JPanel {

    private final GameEventPublisher gameEventPublisher;

    private final GameSession gameSession;

    private final InputValidator inputValidator;

    @PostConstruct
    public void init() {
        this.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(6, 6, 6, 6);

        JLabel widthLabel = new JLabel("Ширина:");
        JTextField widthField = new JTextField(10);
        widthField.setText("60");

        JLabel heightLabel = new JLabel("Высота:");
        JTextField heightField = new JTextField(10);
        heightField.setText("60");

        JLabel nameLabel = new JLabel("Название:");
        JTextField nameField = new JTextField(10);
        nameField.setText("game name");

        JLabel foodLabel = new JLabel("Кол-во еды:");
        JTextField foodField = new JTextField(10);
        foodField.setText("20");

        JLabel nicknameLabel = new JLabel("Никнейм:");
        JTextField nicknameField = new JTextField(10);
        nicknameField.setText("nickname");

        JButton createButton = new JButton("Создать игру");
        createButton.setBackground(Color.GREEN);
        createButton.setForeground(Color.WHITE);

        createButton.addActionListener(e -> {
            if (gameSession.getGameMode() != GameMode.NONE) {
                JOptionPane.showMessageDialog(this, "Вы уже находитесь в игре.");
                return;
            }

            Optional<ServiceException> exception;
            exception = inputValidator.validateNumber(widthField.getText(), "Ширина");
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateNumber(heightField.getText(), "Высота");
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateNumber(foodField.getText(), "Кол-во еды");
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateGameSize(
                    Integer.parseInt(widthField.getText()),
                    Integer.parseInt(heightField.getText())
            );
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateGameName(nameField.getText());
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }
            exception = inputValidator.validateNickname(nicknameField.getText());
            if (exception.isPresent()) {
                JOptionPane.showMessageDialog(this, exception.get().getMessage());
                return;
            }

            gameEventPublisher.publish(
                    new NewGameCreateEvent(
                            this,
                            nameField.getText(),
                            nicknameField.getText(),
                            Integer.parseInt(widthField.getText()),
                            Integer.parseInt(heightField.getText()),
                            Integer.parseInt(foodField.getText())
                    )
            );
        });

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(widthLabel, gbc);

        gbc.gridx = 1;
        this.add(widthField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(heightLabel, gbc);

        gbc.gridx = 1;
        this.add(heightField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(nameLabel, gbc);

        gbc.gridx = 1;
        this.add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(foodLabel, gbc);

        gbc.gridx = 1;
        this.add(foodField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(nicknameLabel, gbc);

        gbc.gridx = 1;
        this.add(nicknameField, gbc);

        gbc.gridwidth = 2;
        gbc.gridx = 0;
        gbc.gridy = 5;
        this.add(createButton, gbc);
    }

}
