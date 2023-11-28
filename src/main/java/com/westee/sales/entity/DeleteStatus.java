package com.westee.sales.entity;

public enum DeleteStatus {
    OK(0),
    DELETED(1);

    private final int value;

    DeleteStatus(int v) {
        this.value = v;
    }

    public int getValue() {
        return value;
    }
}
