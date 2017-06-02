package com.parakultura.familytree.familytreeserver.models;

import java.util.Collection;
import java.util.List;

public interface FamilyMember {

    String getFirstName();

    String getLastName();

    String getMiddleName();

    Collection<String> getNickNames();

    Sex getSex();

    List<? extends LifeEvent> getLifeEvents();

    @SuppressWarnings("unused")
    enum Sex {
        M, F
    }
}
