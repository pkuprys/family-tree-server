package com.parakultura.familytree.familytreeserver.models;

public interface Location {

    long getId();

    String getCountry();

    String getState();

    String getCounty();

    String getCity();

    String getAddress();

    Integer getPostalCode();
}
