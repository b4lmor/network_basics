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

//        var gameListService = ctx.getBean(GameListService.class);
//
//        gameListService.alter(List.of(
//                GameListRow.builder()
//                        .playerCount(10)
//                        .address("123.123.123.123:12333")
//                        .name("cool game")
//                        .build(),
//                GameListRow.builder()
//                        .playerCount(2)
//                        .address("123.123.123.123:55333")
//                        .name("cool game #2")
//                        .build()
//        ));
//
//        var gameInfoService = ctx.getBean(GameInfoService.class);
//
//        gameInfoService.alter(
//                GameInfo.builder()
//                        .width(300)
//                        .height(200)
//                        .maxFood(10)
//                        .gameName("game name")
//                        .address("www.game.com")
//                        .masterNickname("master")
//                        .players(
//                                List.of(
//                                        PlayerInfo.builder()
//                                                .role(Role.MASTER)
//                                                .score(30)
//                                                .nickname("master")
//                                                .build(),
//                                        PlayerInfo.builder()
//                                                .role(Role.NORMAL)
//                                                .score(5)
//                                                .nickname("normal")
//                                                .build(),
//                                        PlayerInfo.builder()
//                                                .role(Role.NORMAL)
//                                                .score(15)
//                                                .nickname("normal2")
//                                                .build(),
//                                        PlayerInfo.builder()
//                                                .role(Role.NORMAL)
//                                                .score(105)
//                                                .nickname("normal3")
//                                                .build()
//                                )
//                        )
//                        .build()
//        );
//
//        var gameFieldService = ctx.getBean(GameFieldService.class);
//
//        gameFieldService.setUnitSize(20, 20);
//
//        Map<Point, Color> changed = new HashMap<>();
//        for (int i = 0; i < 30; i++) {
//            for (int j = 0; j < 30; j++) {
//                changed.put(new Point(i, j), Color.BLACK);
//            }
//        }
//
//        gameFieldService.paint(changed);
//
//        var gameSession = ctx.getBean(GameSession.class);
//
//        gameSession.setGameMode(GameMode.MASTER);
//
//        sleep(5000L);
//
//        gameInfoService.clear();
//        gameFieldService.endGame(30);

    }

}
