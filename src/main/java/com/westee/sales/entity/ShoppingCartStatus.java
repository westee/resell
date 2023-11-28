package com.westee.sales.entity;

import com.westee.sales.data.DataStatus;

public enum ShoppingCartStatus {
    OK(),
    DELETED(),
    PAID();

    public String getName() {
        return name().toLowerCase();
    }

    public static DataStatus fromStatus(String name) {
        try {
            if (name == null) {
                return null;
            }
            return DataStatus.valueOf(name.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
