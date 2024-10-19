package ru.nsu.ccfit.lisitsin.service.mapper;

import game.Api;
import lombok.experimental.UtilityClass;
import ru.nsu.ccfit.lisitsin.service.core.entity.Direction;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameInfo;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameListRow;
import ru.nsu.ccfit.lisitsin.service.core.entity.PlayerInfo;
import ru.nsu.ccfit.lisitsin.service.core.entity.Role;

import java.awt.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@UtilityClass
public class Mapper {

    public static GameInfo map(Api.SendGameInfoFullRequest gameInfoFullRequest) {
        return GameInfo.builder()
                .address(gameInfoFullRequest.getAddress())
                .gameName(gameInfoFullRequest.getGameName())
                .masterNickname(gameInfoFullRequest.getMasterNickname())
                .width(gameInfoFullRequest.getWidth())
                .height(gameInfoFullRequest.getHeight())
                .maxFood(gameInfoFullRequest.getMaxFood())
                .players(
                        gameInfoFullRequest.getPlayersList()
                                .stream()
                                .map(Mapper::map)
                                .sorted(Comparator.comparingInt(PlayerInfo::getScore).reversed())
                                .toList()
                )
                .build();
    }

    public static PlayerInfo map(Api.Player player) {
        return PlayerInfo.builder()
                .score(player.getScore())
                .nickname(player.getNickname())
                .role(map(player.getRole()))
                .build();
    }

    public static Role map(Api.NodeRole role) {
        return switch (role) {
            case NORMAL -> Role.NORMAL;
            case MASTER -> Role.MASTER;
            case DEPUTY -> Role.DEPUTY;
            case VIEWER -> Role.VIEWER;
            default -> throw new IllegalStateException("Unexpected value: " + role);
        };
    }

    public static Api.Directions map(Direction direction) {
        return switch (direction) {
            case UP -> Api.Directions.UP;
            case DOWN -> Api.Directions.DOWN;
            case RIGHT -> Api.Directions.RIGHT;
            case LEFT -> Api.Directions.LEFT;
        };
    }

    public static GameListRow map(Api.GameInfoShort gameInfoShort) {
        return GameListRow.builder()
                .address(gameInfoShort.getAddress())
                .name(gameInfoShort.getGameName())
                .playerCount(gameInfoShort.getPlayerCount())
                .build();
    }

    public static Map<Point, Color> map(Api.FillSquaresRequest o) {
        Map<Point, Color> result = new HashMap<>();
        for (var pointColor : o.getPointsList()) {
            result.put(
                    new Point(pointColor.getPoint().getX(), pointColor.getPoint().getY()),
                    new Color(pointColor.getColor())
            );
        }
        return result;
    }

}
