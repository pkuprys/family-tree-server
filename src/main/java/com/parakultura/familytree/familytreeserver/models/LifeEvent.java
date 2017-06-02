package com.parakultura.familytree.familytreeserver.models;

import java.util.Date;

@SuppressWarnings("unused")
public interface LifeEvent {

    long getId();

    Date getTimestamp();

    String getDescription();

    Location getLocation();

    Type getType();

    enum Type {
        BIRTH,
        MARRIAGE,
        DIVORCE,
        DEATH,
        OTHER
    }
}
