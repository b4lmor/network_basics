package ru.nsu.ccfit.lisitsin.service.core.entity;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class GameInfo {

    int height;

    int width;

    String gameName;

    String masterNickname;

    String address;

    int maxFood;

    List<PlayerInfo> players;

}
