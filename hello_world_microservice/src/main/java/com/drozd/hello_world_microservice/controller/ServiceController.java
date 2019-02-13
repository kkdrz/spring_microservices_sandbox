package com.drozd.hello_world_microservice.controller;

import com.drozd.hello_world_microservice.config.ServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {

    @Autowired
    ServiceConfig serviceConfig;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRandomProperty() {
        return serviceConfig.getRandomProperty();
    }
}
