package ru.nsu.ccfit.lisitsin.service;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameInfo;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameListRow;
import ru.nsu.ccfit.lisitsin.service.core.entity.PlayerInfo;
import ru.nsu.ccfit.lisitsin.service.core.entity.Role;
import ru.nsu.ccfit.lisitsin.service.core.service.GameFieldService;
import ru.nsu.ccfit.lisitsin.service.core.service.GameInfoService;
import ru.nsu.ccfit.lisitsin.service.core.service.GameListService;
import ru.nsu.ccfit.lisitsin.service.core.session.GameMode;
import ru.nsu.ccfit.lisitsin.service.core.session.GameSession;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Thread.sleep;

@EnableConfigurationProperties(PropertiesConfig.class)
@SpringBootApplication
public class SnakeDesktop {

    public static void main(String[] args) throws InterruptedException {
        var ctx = new SpringApplicationBuilder(SnakeDesktop.class)
                .headless(false)
                .run(args);
    }

}
