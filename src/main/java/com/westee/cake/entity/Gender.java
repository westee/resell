package com.westee.cake.entity;

public enum Gender {
    MALE(0),
    FEMALE(1);

    private final int value;

    Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
