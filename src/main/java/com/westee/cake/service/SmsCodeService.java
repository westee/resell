package com.westee.cake.service;

public interface SmsCodeService {
    String sendCode(String tel);

    boolean getCodeStatus(String tel, String code);
}
