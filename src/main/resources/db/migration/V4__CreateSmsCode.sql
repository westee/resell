CREATE TABLE SMS_CODE
(
    ID         BIGINT PRIMARY KEY AUTO_INCREMENT,
    USED       TINYINT(1), -- 0:未使用 1:已使用
    TEL        VARCHAR(20),
    CODE       VARCHAR(6),
    TYPE       ENUM('REGISTER', 'LOGIN', 'FORGOT_PASSWORD', 'VERIFY_PHONE', 'PAY_PASSWORD'),
    CREATED_AT TIMESTAMP NOT NULL DEFAULT NOW(),
    UPDATED_AT TIMESTAMP NOT NULL DEFAULT NOW()
);