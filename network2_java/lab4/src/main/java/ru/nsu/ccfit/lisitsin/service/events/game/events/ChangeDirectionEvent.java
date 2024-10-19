package ru.nsu.ccfit.lisitsin.service.events.game.events;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.context.ApplicationEvent;
import ru.nsu.ccfit.lisitsin.service.core.entity.Direction;

@EqualsAndHashCode(callSuper = true)
@Value
public class ChangeDirectionEvent extends ApplicationEvent {

    Direction direction;

    public ChangeDirectionEvent(java.awt.Component source, Direction direction) {
        super(source);
        this.direction = direction;
    }

}
