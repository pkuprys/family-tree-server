package com.parakultura.familytree.familytreeserver.models;

import java.util.Collection;
import java.util.List;

public interface FamilyMember {

    long getId();

    String getFirstName();

    String getLastName();

    String getMiddleName();

    Collection<String> getNickNames();

    Sex getSex();

    List<LifeEvent> getLifeEvents();

    List<FamilyMember> getParents();

    @SuppressWarnings("unused")
    enum Sex {
        M, F
    }
}
