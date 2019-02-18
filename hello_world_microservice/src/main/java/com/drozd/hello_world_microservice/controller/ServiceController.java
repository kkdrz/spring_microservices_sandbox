package com.drozd.hello_world_microservice.controller;

import com.drozd.hello_world_microservice.config.ServiceConfig;
import com.drozd.hello_world_microservice.service.FooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ServiceController {

    Logger log = LoggerFactory.getLogger(ServiceController.class);

    @Autowired
    ServiceConfig serviceConfig;

    @Autowired
    FooService fooService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String getRandomProperty() {
        return serviceConfig.getRandomProperty();
    }

    @GetMapping(path = "/foo/{fooId}")
    public String getFoo(@PathVariable String fooId) {
        String fooResponse = fooService.getFoo(fooId);

        log.info("foo_service returned: " + fooResponse);

        return "foo_service returned: " + fooResponse;
    }
}
