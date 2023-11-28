package com.westee.sales.data;

public enum ChargeType {
    WECHAT(),
    ALIPAY();

    public String getName() {
        return name().toLowerCase();
    }
}
