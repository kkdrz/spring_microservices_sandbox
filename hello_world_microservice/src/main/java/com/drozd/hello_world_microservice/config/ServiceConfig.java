package com.drozd.hello_world_microservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ServiceConfig {


    @Value("${random.property}")
    private String randomProperty;

    public String getRandomProperty() {
        return randomProperty;
    }

}
