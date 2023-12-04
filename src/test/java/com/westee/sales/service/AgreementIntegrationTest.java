package com.westee.sales.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.westee.sales.CakeApplication;
import com.westee.sales.generate.Agreement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CakeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"spring.config.location=classpath:test-application.yml"})
public class AgreementIntegrationTest extends AbstractIntegrationTest {

    @Test
    public void createAgreementNotAuthorized() throws JsonProcessingException {
        UserLoginResponse userLoginResponse = loginAndGetToken();
        String token = userLoginResponse.token;

        // 普通用户post请求/api/v1/agreement创建agreement 应该得到notAuthorized相应
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("satoken", token);

        // Assert that the response is notAuthorized
        HttpClientErrorException exception = Assertions.assertThrows(HttpClientErrorException.class, () -> {
            doHttpRequest("/api/v1/agreement", HttpMethod.POST, headers, new Agreement());
        });
        assertEquals(401, exception.getStatusCode().value());
    }

    @Test
    public void getAgreementList() throws JsonProcessingException {
        UserLoginResponse userLoginResponse = loginAndGetToken();
        String token = userLoginResponse.token;

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("satoken", token);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("pageNum", "1");
        hashMap.put("pageSize", "10");

        ResponseEntity<String> response = doHttpRequest("/api/v1/agreement", HttpMethod.GET, headers, hashMap);
    }
}
