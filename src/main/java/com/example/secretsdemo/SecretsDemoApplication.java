package com.example.secretsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(NotionConfigProperties.class)
public class SecretsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecretsDemoApplication.class, args);
    }

}
