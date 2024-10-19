package ru.nsu.ccfit.lisitsin.service.core.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameInfo;
import ru.nsu.ccfit.lisitsin.service.view.panel.GameInfoPanel;

@Service
@RequiredArgsConstructor
public class GameInfoService {

    private final GameInfoPanel gameInfoPanel;

    public void alter(GameInfo gameInfo) {
        gameInfoPanel.clearLeaderboard();
        gameInfo.getPlayers().forEach(player -> gameInfoPanel.addPlayer(player.getNickname(), player.getScore()));
        gameInfoPanel.updateGameName(gameInfo.getGameName());
        gameInfoPanel.updateHostPlayer(gameInfo.getMasterNickname());
        gameInfoPanel.updateHeight(String.valueOf(gameInfo.getHeight()));
        gameInfoPanel.updateWidth(String.valueOf(gameInfo.getWidth()));
        gameInfoPanel.updateMaxFood(String.valueOf(gameInfo.getMaxFood()));
    }

    public void clear() {
        gameInfoPanel.clear();
    }

}
