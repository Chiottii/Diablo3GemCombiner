package com.models;

public abstract class Gem {

    private String type;
    private int value;

    // Constructor
    public Gem (String type, int value) {
        this.type = type;
        this.value = value;
    }

    // Getters & Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
