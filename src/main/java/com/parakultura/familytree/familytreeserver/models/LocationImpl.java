package com.parakultura.familytree.familytreeserver.models;

@SuppressWarnings("unused")
public class LocationImpl implements Location {

    private long id;
    private String country;
    private String state;
    private String county;
    private String city;
    private String address;
    private Integer postalCode;

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
}
