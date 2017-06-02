package com.parakultura.familytree.familytreeserver.models;

import com.parakultura.familytree.familytreeserver.entities.LifeEventEntity;

import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class FamilyMemberImpl implements FamilyMember {

    private String firstName;
    private String middleName;
    private String lastName;
    private Set<String> nickNames;
    private FamilyMember.Sex sex;
    private List<LifeEventEntity> lifeEvents;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<String> getNickNames() {
        return nickNames;
    }

    public FamilyMember.Sex getSex() {
        return sex;
    }

    public List<LifeEventEntity> getLifeEvents() {
        return lifeEvents;
    }
}
