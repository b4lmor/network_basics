package ru.nsu.ccfit.lisitsin.service.core.validation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;
import ru.nsu.ccfit.lisitsin.service.core.error.ServiceException;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class InputValidator {

    private final PropertiesConfig propertiesConfig;

    public Optional<ServiceException> validateNumber(String rawNumber, String fieldName) {
        if (rawNumber == null || !rawNumber.matches("[0-9]+")) {
            return Optional.of(
                    ServiceException.builder()
                            .message(fieldName + " не соответсвует формату.")
                            .build()
            );
        } else {
            return Optional.empty();
        }
    }

    public Optional<ServiceException> validateGameSize(int width, int height) {
        int fieldSize = Math.min(propertiesConfig.width(), propertiesConfig.height());
        if (fieldSize % width != 0) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Ширина должна быть пропорциональна %d.".formatted(fieldSize))
                            .build()
            );
        } else if (fieldSize % height != 0) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Высота должна быть пропорциональна %d.".formatted(fieldSize))
                            .build()
            );
        } else if (width < 15 || height < 15) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Минимальный размер поля: 15х15")
                            .build()
            );
        } else if (width != height) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Ширина и Высота должны быть равны.")
                            .build()
            );
        } else {
            return Optional.empty();
        }

    }

    public Optional<ServiceException> validateNickname(String nickname) {
        if (nickname.length() < 3) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Никнейм должен быть длиннее 2 символов.")
                            .build()
            );
        } else {
            return Optional.empty();
        }
    }

    public Optional<ServiceException> validateAddress(String address) {
        if (address.isBlank()) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Адрес не может быть пустым.")
                            .build()
            );
        } else {
            return Optional.empty();
        }
    }

    public Optional<ServiceException> validateGameName(String gameName) {
        if (gameName.length() < 5) {
            return Optional.of(
                    ServiceException.builder()
                            .message("Название игры должно быть длиннее 4 символов.")
                            .build()
            );
        } else {
            return Optional.empty();
        }
    }

}
