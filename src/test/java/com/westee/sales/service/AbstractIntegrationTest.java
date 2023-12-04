package com.westee.sales.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.westee.sales.data.Register;
import com.westee.sales.entity.LoginResponse;
import com.westee.sales.entity.LoginResult;
import com.westee.sales.entity.TelAndPassword;
import com.westee.sales.generate.User;
import jakarta.inject.Inject;
import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.configuration.ClassicConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

import static java.net.HttpURLConnection.HTTP_OK;

public class AbstractIntegrationTest {
    @Inject
    Environment environment;

    private final RestTemplate restTemplate = new RestTemplate();

    public static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    @Value("${spring.datasource.url}")
    private String databaseUrl;
    @Value("${spring.datasource.username}")
    private String databaseUsername;
    @Value("${spring.datasource.password}")
    private String databasePassword;

    private final String TEL = "15611111111";
    private final String PASSWORD = "123456";
    private final String INVALID_PASSWORD = "admin";

    TelAndPassword VALID_PARAMS = new TelAndPassword(TEL, PASSWORD);
    TelAndPassword INVALID_PARAMS = new TelAndPassword(TEL, INVALID_PASSWORD);

    @BeforeEach
    public void initDataBase() {
        ClassicConfiguration conf = new ClassicConfiguration();
        conf.setDataSource(databaseUrl, databaseUsername, databasePassword);
        conf.setCleanDisabled(false);
        Flyway flyway = new Flyway(conf);
        flyway.clean();
        flyway.migrate();
    }

    public String getUrl(String apiName) {
        // 获取集成测试的端口号
        return "http://localhost:" + environment.getProperty("local.server.port") + apiName;
    }

    @Test
    public UserLoginResponse loginAndGetToken() throws JsonProcessingException {
        String statusResponse = doHttpRequest("/api/v1/status", HttpMethod.GET, null, null).getBody();

        LoginResponse statusResponseData = objectMapper.readValue(statusResponse, LoginResponse.class);
        Assertions.assertFalse(statusResponseData.isLogin());

        // 获取验证码
        int responseCode = doHttpRequest("/api/v1/register-password", HttpMethod.POST, null,
                objectMapper.writeValueAsString(generateRegister())).getStatusCode().value();
        Assertions.assertEquals(HTTP_OK, responseCode);

        // 使用验证码登录
        String body = doHttpRequest("/api/v1/login-password", HttpMethod.POST,
                null, objectMapper.writeValueAsString(VALID_PARAMS)).getBody();

        LoginResult loginResponse = objectMapper.readValue(body, LoginResult.class);
        Assertions.assertTrue(loginResponse.isLoginStatus());
        Assertions.assertNotNull(loginResponse.getToken());

        statusResponseData = objectMapper.readValue(statusResponse, LoginResponse.class);
        return new UserLoginResponse(null, statusResponseData.getUser(), loginResponse.getToken());
    }

    // 获取cookie
    private String getSessionIdFromSetCookie(String session) {
        int semiColonIndex = session.indexOf(";");
        return session.substring(0, semiColonIndex);
    }

    public static class UserLoginResponse {
        String cookie;
        User user;
        String token;

        public UserLoginResponse() {}

        public UserLoginResponse(String cookie, User user, String token) {
            this.cookie = cookie;
            this.user = user;
            this.token = token;
        }

        public String getCookie() {
            return cookie;
        }

        public void setCookie(String cookie) {
            this.cookie = cookie;
        }

        public User getUser() {
            return user;
        }

        public void setUser(User user) {
            this.user = user;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }

    public static class HttpResponse {
        int code;
        String body;
        Map<String, List<String>> headers;

        public HttpResponse(int code, String body, Map<String, List<String>> headers) {
            this.code = code;
            this.body = body;
            this.headers = headers;
        }

        HttpResponse assertOkStatusCode() {
            Assertions.assertTrue(code >= 200 && code < 300, "" + code + ": " + body);
            return this;
        }

        public <T> T asJsonObject(TypeReference<T> data) throws JsonProcessingException {
            return objectMapper.readValue(body, data);
        }
    }

    public ResponseEntity<String> doHttpRequest(String apiName, HttpMethod method, MultiValueMap<String, String> headers, Object body) {
        HttpHeaders httpHeaders = new HttpHeaders();
        if (headers != null) {
            httpHeaders.addAll(headers);
        }
        httpHeaders.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Object> requestEntity = new HttpEntity<>(body, httpHeaders);
        ResponseEntity<String> exchange = null;
//        try {
            exchange = restTemplate.exchange(getUrl(apiName), method, requestEntity, String.class);
            return exchange;
//        } catch (HttpClientErrorException e) {
//            ResponseEntity<String> stringResponseEntity = new ResponseEntity<String>(e.getStatusCode());
//            return stringResponseEntity;
//        }
    }


     public Register generateRegister() {
         Register register = new Register();
         register.setUsername("老王");
         register.setPassword("123456");
         register.setRepeatPassword("123456");
         register.setAuthCode("111111");
         register.setInviteCode("222222");
         register.setAvatar("avatar_");
         register.setPhoneNo("15611111111");
         return register;
     }
}
