package com.westee.sales.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config.properties") //读取配置文件
@ConfigurationProperties(prefix = "sms")
public class TencentSmsConfig {
    static String secretId;
    public static String secretKey;
    public static String sdkAppId;
    public static String templateId;

    public static String getSecretId() {
        return TencentSmsConfig.secretId;
    }

    public void setSecretId(String secretId) {
        TencentSmsConfig.secretId = secretId;
    }

    public static String getSecretKey() {
        return TencentSmsConfig.secretKey;
    }

    public void setSecretKey(String secretKey) {
        TencentSmsConfig.secretKey = secretKey;
    }

    public static String getSdkAppId() {
        return TencentSmsConfig.sdkAppId;
    }

    public void setSdkAppId(String sdkAppId) {
        TencentSmsConfig.sdkAppId = sdkAppId;
    }

    public static String getTemplateId() {
        return TencentSmsConfig.templateId;
    }

    public void setTemplateId(String templateId) {
        TencentSmsConfig.templateId = templateId;
    }
}
