package com.parakultura.familytree.familytreeserver.models;

import com.parakultura.familytree.familytreeserver.entities.LocationEntity;

import java.util.Date;

@SuppressWarnings("unused")
public class LifeEventImpl implements LifeEvent {
    private long id;
    private Type type;
    private Date timestamp;
    private LocationEntity location;
    private String description;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public LocationEntity getLocation() {
        return location;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
