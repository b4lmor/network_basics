package ru.nsu.ccfit.lisitsin.service.events.game.events;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.context.ApplicationEvent;

@EqualsAndHashCode(callSuper = true)
@Value
public class LeaveGameEvent extends ApplicationEvent {

    public LeaveGameEvent(java.awt.Component source) {
        super(source);
    }

}
