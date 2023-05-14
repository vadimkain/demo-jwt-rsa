package com.jwt.demojwttrying;

import com.jwt.demojwttrying.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class DemoJwtTryingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJwtTryingApplication.class, args);
    }

}
