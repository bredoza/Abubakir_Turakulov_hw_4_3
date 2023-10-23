package com.example.abubakir_turakulov_hw_4_3.models;

public class Country {
    private final String name;
    private final String flagImageUrl;

    public Country(String name, String flagImageUrl) {
        this.name = name;
        this.flagImageUrl = flagImageUrl;
    }

    public String getName() {
        return name;
    }

    public String getFlagImageUrl() {
        return flagImageUrl;
    }
}