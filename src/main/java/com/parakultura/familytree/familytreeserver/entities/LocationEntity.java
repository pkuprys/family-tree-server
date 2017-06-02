package com.parakultura.familytree.familytreeserver.entities;

import com.parakultura.familytree.familytreeserver.models.Location;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@SuppressWarnings("unused")
@Entity
public class LocationEntity implements Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String country;
    @Column
    private String state;
    @Column
    private String county;
    @Column
    private String city;
    @Column
    private String address;
    @Column
    private Integer postalCode;

    @SuppressWarnings("WeakerAccess")
    protected LocationEntity() {}

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getCounty() {
        return county;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public Integer getPostalCode() {
        return postalCode;
    }

    static LocationEntity from(@NotNull Location location) {
        LocationEntity le = new LocationEntity();
        le.country = location.getCountry();
        le.state = location.getState();
        le.county = location.getCounty();
        le.city = location.getCity();
        le.address = location.getAddress();
        le.postalCode = location.getPostalCode();
        return le;
    }
}
