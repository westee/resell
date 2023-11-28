package com.westee.sales.entity;

import com.westee.sales.util.ValidationConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TelAndPassword {
    @NotBlank(message = "手机号不能为空")
    @Pattern(regexp = ValidationConstants.PHONE_NUMBER_PATTERN, message = "手机号格式不正确")
    private String tel;
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 32, message = "密码长度必须在 6 到 32 位之间")
    private String password;

    public TelAndPassword(String tel, String code) {
        this.tel = tel;
        this.password = code;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String code) {
        this.password = code;
    }
}
