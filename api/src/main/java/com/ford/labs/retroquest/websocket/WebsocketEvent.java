package com.ford.labs.retroquest.websocket;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;

@Getter
@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = NONE, getterVisibility = NONE)
public abstract class WebsocketEvent {
    @JsonProperty
    private final WebsocketEventType type;
    @JsonProperty
    private final Object payload;

    public abstract String getRoute();
}
