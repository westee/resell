package com.westee.sales.controller;

import cn.dev33.satoken.stp.StpUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.westee.sales.data.Register;
import com.westee.sales.entity.LoginResponse;
import com.westee.sales.entity.LoginResult;
import com.westee.sales.entity.TelAndCode;
import com.westee.sales.entity.TelAndPassword;
import com.westee.sales.entity.WXParams;
import com.westee.sales.entity.WeChatSession;
import com.westee.sales.generate.User;
import com.westee.sales.realm.JWTUtil;
import com.westee.sales.realm.LoginType;
import com.westee.sales.realm.UserToken;
import com.westee.sales.service.AuthService;
import com.westee.sales.service.CheckTelService;
import com.westee.sales.service.UserService;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class AuthController {
    private final AuthService authService;
    private final CheckTelService checkTelService;
    private final UserService userService;


    @Autowired
    public AuthController(AuthService authService, CheckTelService checkTelService, UserService userService) {
        this.checkTelService = checkTelService;
        this.authService = authService;
        this.userService = userService;
    }


    @PostMapping("/login-sms")
    public void login(@RequestBody TelAndCode telAndCode) {
        // https://shiro.apache.org/authentication.html
        UsernamePasswordToken token = new UsernamePasswordToken(telAndCode.getTel(),
                telAndCode.getCode());
        token.setRememberMe(true);
        SecurityUtils.getSubject().login(token);
    }

    @PostMapping("/login-password")
    public LoginResult login(@Validated @RequestBody TelAndPassword TelAndPassword, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return LoginResult.fail(bindingResult.getFieldError().getDefaultMessage());
        }
        User user = userService.telAndPasswordLogin(TelAndPassword);
        return LoginResult.success("登录成功", user, false, StpUtil.getTokenValue());
    }

    @PostMapping("/login-wechat")
    public LoginResult login(@RequestBody WXParams usernameAndPassword) {
        UserToken token = new UserToken(LoginType.WECHAT_LOGIN, usernameAndPassword.getCode(),
                usernameAndPassword.getCode(), usernameAndPassword.getCode());
        return shiroLogin(token, LoginType.WECHAT_LOGIN);
    }

    @PostMapping("/register-password")
    public User register(@RequestBody Register register) {
        return userService.createUserIfNotExist(register);
    }

    /**
     * @param params {wxcode, avatar, name}
     * @return 登录信息
     */
    @GetMapping("/send-wxcode")
    public LoginResult sendWXCode(@RequestParam Map<String, String> params) throws JsonProcessingException {
        WeChatSession session = userService.getWeChatSession(params);
        String openid = session.getOpenid();
        UserToken token = new UserToken(LoginType.WECHAT_LOGIN, openid,
                openid, openid);
        token.setRememberMe(true);
        return shiroLogin(token, LoginType.WECHAT_LOGIN);
    }

    @PostMapping("/code")
    public void sendCode(@RequestBody TelAndCode telAndCode, HttpServletResponse response) {
        if (checkTelService.verifyTelParams(telAndCode)) {
            authService.sendVerificationCode(telAndCode.getTel());
        } else {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
        }
    }

    @GetMapping("/token")
    public LoginResult testToken() {
        UserToken userToken = new UserToken(LoginType.USER_PHONE, "111111", "111111");
        return shiroLogin(userToken, LoginType.USER_PHONE);
    }

    @GetMapping("/status")
    public LoginResponse getStatus() {

        // 获取当前 Subject 对象
        Subject subject = SecurityUtils.getSubject();
        // 判断当前用户是否已经登录
        if (StpUtil.isLogin()) {
            return LoginResponse.alreadyLogin(null);
        }
        return LoginResponse.notLogin();
    }

    public LoginResult shiroLogin(UserToken token, LoginType type) {
        try {
            //登录不在该处处理，交由shiro处理
            Subject subject = SecurityUtils.getSubject();
            subject.login(token);

            if (subject.isAuthenticated()) {
                String jwtToken = JWTUtil.sign(token.getUsername(), type); //使用JWTRealm生成token
                User userByName;
                if (type == LoginType.WECHAT_LOGIN) {
                    userByName = userService.getByOpenid(token.getUsername());
                } else {
                    userByName = userService.getUserByName(token.getUsername());
                }
                Session session = subject.getSession();
                session.setAttribute("user", userByName);
                return LoginResult.success("登录成功", userByName, false, jwtToken);
            } else {
                return LoginResult.fail("用户名密码不匹配");
            }
        } catch (IncorrectCredentialsException | UnknownAccountException e) {
            e.printStackTrace();
            return LoginResult.fail("用户名密码不匹配");
        } catch (LockedAccountException e) {
            return LoginResult.fail("账号被冻结");
        } catch (AuthenticationException e) {
            return LoginResult.fail("用户名或密码不正确");
        } catch (Exception e) {
            return LoginResult.fail(e.getMessage());
        }
    }
}
