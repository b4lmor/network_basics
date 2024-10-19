package ru.nsu.ccfit.lisitsin.service.events.game;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GameEventPublisher {

    private final ApplicationEventPublisher publisher;

    public <T extends ApplicationEvent> void publish(T event) {
        publisher.publishEvent(event);
    }

}
