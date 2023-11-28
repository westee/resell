package com.westee.sales.data;

import com.westee.sales.util.ValidationConstants;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Register {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, max = 32, message = "密码长度必须在 6 到 32 位之间")
    private String password;
    private String repeatPassword;
    @NotBlank(message = "验证码不能为空")
    private String authCode;
    private String inviteCode;
    @NotBlank(message = "请设置头像")
    private String avatar;
    @Pattern(regexp = ValidationConstants.PHONE_NUMBER_PATTERN, message = "手机号格式不正确")
    private String phoneNo;
}
