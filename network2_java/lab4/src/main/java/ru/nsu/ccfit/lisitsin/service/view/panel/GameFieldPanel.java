package ru.nsu.ccfit.lisitsin.service.view.panel;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.nsu.ccfit.lisitsin.service.config.PropertiesConfig;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
@RequiredArgsConstructor
public class GameFieldPanel extends JPanel {

    private int size;

    private boolean isToClear = false;

    @Setter
    private int unitSize;

    private final Map<Point, Color> coloredSquares = new HashMap<>();

    private final PropertiesConfig propertiesConfig;

    @PostConstruct
    public void init() {
        this.size = Math.min(propertiesConfig.width(), propertiesConfig.height());
        this.setPreferredSize(new Dimension(size, size));
        this.setFocusable(true);
    }

    public void fillSquares(Map<Point, Color> changed) {
        coloredSquares.putAll(changed);
        repaint();
    }

    public void clear() {
        isToClear = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (isToClear) {
            g.clearRect(0, 0, size, size);
            isToClear = false;
            return;
        }
        if (coloredSquares.isEmpty()) {
            return;
        }
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, size, size);
        for (Map.Entry<Point, Color> entry : coloredSquares.entrySet()) {
            Point point = entry.getKey();
            Color color = entry.getValue();
            g.setColor(color);
            g.fillRect(point.x * unitSize, point.y * unitSize, unitSize, unitSize);
        }
        coloredSquares.clear();
    }
}
