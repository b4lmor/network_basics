package ru.nsu.ccfit.lisitsin.service.core.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class GameListRow {

    String address;

    String name;

    int playerCount;

}
