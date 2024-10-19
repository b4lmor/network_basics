package ru.nsu.ccfit.lisitsin.service.events.game.events;

import lombok.EqualsAndHashCode;
import lombok.Value;
import org.springframework.context.ApplicationEvent;

@EqualsAndHashCode(callSuper = true)
@Value
public class NewGameCreateEvent extends ApplicationEvent {

    String gameName;

    String nickname;

    int width;

    int height;

    int food;

    public NewGameCreateEvent(java.awt.Component source, String gameName, String nickname, int width, int height, int food) {
        super(source);
        this.gameName = gameName;
        this.nickname = nickname;
        this.width = width;
        this.height = height;
        this.food = food;
    }

}
