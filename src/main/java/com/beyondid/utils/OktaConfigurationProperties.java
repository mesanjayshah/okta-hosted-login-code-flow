package com.beyondid.utils;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Setter
@Getter
@Configuration
@ConfigurationProperties(prefix = "okta.oauth2")
@PropertySource("classpath:application.yml")
public class OktaConfigurationProperties {

    private String orgUrl;
    private String token;
    private String clientId;
    private String clientSecret;

}
