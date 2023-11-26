package com.westee.cake.data;

import lombok.Data;

@Data
public class Register {
    private String username;
    private String password;
    private String repeatPassword;
    private String authCode;
    private String inviteCode;
    private String avatar;
    private String phoneNo;
}
