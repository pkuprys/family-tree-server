package com.parakultura.familytree.familytreeserver.entities;

import com.parakultura.familytree.familytreeserver.models.LifeEvent;
import com.parakultura.familytree.familytreeserver.models.Location;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@SuppressWarnings("unused")
@Entity
public class LifeEventEntity implements LifeEvent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private Type type;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timestamp;

    @ManyToOne(cascade = CascadeType.ALL)
    private LocationEntity location;

    @Column
    private String description;

    @SuppressWarnings("WeakerAccess")
    protected LifeEventEntity() {
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setLocation(LocationEntity location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
    public String getDescription() {
        return description;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    static LifeEventEntity from(@NotNull LifeEvent lifeEvent) {
        LifeEventEntity lee = new LifeEventEntity();
        lee.type = lifeEvent.getType();
        lee.timestamp = lifeEvent.getTimestamp();
        if (lifeEvent.getLocation() != null)
            lee.location = LocationEntity.from(lifeEvent.getLocation());
        lee.description = lifeEvent.getDescription();
        return lee;
    }
}
