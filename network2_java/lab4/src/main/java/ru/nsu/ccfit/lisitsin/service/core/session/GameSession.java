package ru.nsu.ccfit.lisitsin.service.core.session;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@RequiredArgsConstructor
public class GameSession {

    private GameMode gameMode = GameMode.NONE;

}
