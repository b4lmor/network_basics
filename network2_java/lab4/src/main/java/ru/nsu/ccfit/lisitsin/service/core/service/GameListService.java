package ru.nsu.ccfit.lisitsin.service.core.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.nsu.ccfit.lisitsin.service.core.entity.GameListRow;
import ru.nsu.ccfit.lisitsin.service.view.panel.GameListPanel;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class GameListService {

    private final GameListPanel gameListPanel;

    public void alter(List<GameListRow> rows) {
        log.info("Received {} games!", rows.size());
        gameListPanel.clearGameList();
        rows.forEach(row -> gameListPanel.addGame(row.getName(), row.getAddress(), row.getPlayerCount()));
    }

}
