package com.parakultura.familytree.familytreeserver.models;

import java.util.List;
import java.util.Set;

@SuppressWarnings("unused")
public class FamilyMemberImpl implements FamilyMember {

    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private Set<String> nickNames;
    private FamilyMember.Sex sex;
    private List<LifeEvent> lifeEvents;
    private List<FamilyMember> parents;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public Set<String> getNickNames() {
        return nickNames;
    }

    @Override
    public FamilyMember.Sex getSex() {
        return sex;
    }

    @Override
    public List<LifeEvent> getLifeEvents() {
        return lifeEvents;
    }

    @Override
    public List<FamilyMember> getParents() {
        return parents;
    }
}
