package ru.nsu.ccfit.lisitsin.service.config;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.checkerframework.common.value.qual.IntRange;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties(prefix = "app")
public record PropertiesConfig(

        @NotNull
        @IntRange(from = 0, to = 1<<16)
        Integer serverPort,

        @NotNull
        String serverHost,

        @NotNull
        @IntRange(from = 0, to = 1<<16)
        Integer clientPort,

        @NotNull
        String clientHost,

        @NotNull
        @Positive
        Integer width,

        @NotNull
        @Positive
        Integer height,

        @NotNull
        String title

) {
}
