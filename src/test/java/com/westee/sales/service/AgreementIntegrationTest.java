package com.westee.sales.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.westee.sales.CakeApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = CakeApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(properties = {"spring.config.location=classpath:test-application.yml"})
public class AgreementIntegrationTest extends AbstractIntegrationTest {
    @Autowired
    private AgreementService agreementService;

    @Test
    public void createAgreement() throws JsonProcessingException {
    }

    @Test
    public void getAgreementList() throws JsonProcessingException {
    }
}
