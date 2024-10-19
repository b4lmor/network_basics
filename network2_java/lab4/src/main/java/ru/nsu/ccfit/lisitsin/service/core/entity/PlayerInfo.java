package ru.nsu.ccfit.lisitsin.service.core.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class PlayerInfo {

    String nickname;

    int score;

    Role role;

}
