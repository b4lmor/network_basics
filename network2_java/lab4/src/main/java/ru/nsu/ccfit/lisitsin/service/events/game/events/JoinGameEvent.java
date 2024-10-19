package ru.nsu.ccfit.lisitsin.service.events.game.events;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.context.ApplicationEvent;

@EqualsAndHashCode(callSuper = true)
@Value
public class JoinGameEvent extends ApplicationEvent {

    String address;

    String nickname;

    public JoinGameEvent(java.awt.Component source, String address, String nickname) {
        super(source);
        this.address = address;
        this.nickname = nickname;
    }

}
