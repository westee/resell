package com.westee.cake.entity;

public class TelAndCode {
    private String tel;
    private String code;

    public TelAndCode(String tel, String password) {
        this.tel = tel;
        this.code = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
