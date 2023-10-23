package com.example.abubakir_turakulov_hw_4_3.models;

import java.io.Serializable;

public class Continent implements Serializable {
    private final String name;
    private final String image;

    public Continent(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}