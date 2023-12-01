package com.westee.sales.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.westee.sales.CakeApplication;
import com.westee.sales.entity.LoginResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CakeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"spring.config.location=classpath:test-application.yml"})
public class AuthIntegrationTest extends AbstractIntegrationTest{

    @Test
    public void loginLogoutTest() throws JsonProcessingException {
        UserLoginResponse userLoginResponse = loginAndGetToken();
        String token = userLoginResponse.token;

        MultiValueMap<String, String> stringStringMultiValueMap = new LinkedMultiValueMap<>();
        stringStringMultiValueMap.add("satoken", token);
        // 此时应该为登录状态
        String statusResponse = doHttpRequest("/api/v1/status", HttpMethod.GET, stringStringMultiValueMap, null).getBody();

        // 将statusResponse读取成LoginResponse。
        LoginResponse response = objectMapper.readValue(statusResponse, LoginResponse.class);
        Assertions.assertTrue(response.isLogin());

    }

}
