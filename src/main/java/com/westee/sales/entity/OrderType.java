package com.westee.sales.entity;

public enum OrderType {
    GOODS(),
    CHARGE();

    public String getName() {
        return name().toLowerCase();
    }
}
