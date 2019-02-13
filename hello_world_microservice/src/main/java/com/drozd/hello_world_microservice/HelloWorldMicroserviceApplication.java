package com.drozd.hello_world_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@SpringBootApplication
public class HelloWorldMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMicroserviceApplication.class, args);
    }

}

