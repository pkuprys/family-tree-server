package com.parakultura.familytree.familytreeserver.entities;


import com.parakultura.familytree.familytreeserver.models.FamilyMember;
import com.parakultura.familytree.familytreeserver.models.LifeEvent;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@Entity
public class FamilyMemberEntity implements FamilyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String firstName;
    @Column
    private String middleName;
    @Column
    private String lastName;
    @ElementCollection
    private Set<String> nickNames;
    @Column
    private Sex sex;
    @OneToMany(cascade = CascadeType.ALL)
    private List<LifeEventEntity> lifeEvents;

    @SuppressWarnings("WeakerAccess")
    protected FamilyMemberEntity() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public void addLifeEvent(@NotNull LifeEventEntity lifeEvent) {
        if (lifeEvents == null)
            lifeEvents = new ArrayList<>();
        lifeEvents.add(lifeEvent);
    }

    public void addNickNames(@NotNull String... nickNames) {
        if (this.nickNames == null)
            this.nickNames = new HashSet<>();
        this.nickNames.addAll(Arrays.asList(nickNames));
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getMiddleName() {
        return middleName;
    }

    @Override
    public Collection<String> getNickNames() {
        return nickNames;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public List<? extends LifeEvent> getLifeEvents() {
        return lifeEvents;
    }

    public long getId() {
        return id;
    }

    public static FamilyMemberEntity from(FamilyMember familyMember) {
        FamilyMemberEntity fme = new FamilyMemberEntity();
        fme.firstName = familyMember.getFirstName();
        fme.middleName = familyMember.getMiddleName();
        fme.lastName = familyMember.getLastName();
        if (familyMember.getNickNames() != null)
            fme.nickNames = new HashSet<>(familyMember.getNickNames());
        fme.sex = familyMember.getSex();
        if (familyMember.getLifeEvents() != null) {
            fme.lifeEvents = familyMember.getLifeEvents().stream().map(LifeEventEntity::from)
                    .collect(Collectors.toList());
        }
        return fme;
    }
}