CREATE TABLE USER
(
    ID                 BIGINT PRIMARY KEY AUTO_INCREMENT,
    REAL_NAME          VARCHAR(100),
    TEL                VARCHAR(20) UNIQUE,
    AVATAR_URL         VARCHAR(1024),
    ADDRESS            VARCHAR(1024),
    ROLE_ID            BIGINT,
    WX_OPEN_ID         varchar(1024),
    WX_SESSION_KEY     varchar(1024),
    BIRTHDAY           TIMESTAMP,
    SEX                TINYINT,
    INVITE_CODE        VARCHAR(20),
    PARENT_INVITE_CODE VARCHAR(20),
    PASSWORD           VARCHAR(100),
    PASSWORD_SALT      VARCHAR(100),
    NICKNAME           VARCHAR(100),
    BALANCE            DECIMAL(12, 2),
    CREATED_AT         TIMESTAMP NOT NULL DEFAULT NOW(),
    UPDATED_AT         TIMESTAMP NOT NULL DEFAULT NOW()
);
