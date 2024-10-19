package ru.nsu.ccfit.lisitsin.service.events.game.events;

import org.springframework.context.ApplicationEvent;

public class ExitGameEvent extends ApplicationEvent {

    public ExitGameEvent(Object source) {
        super(source);
    }

}
