package com.drozd.hello_world_microservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
@FeignClient("foo-service")
public interface FooService {

    @RequestMapping(
            method = RequestMethod.GET,
            value = "/v1/foo/{fooId}",
            consumes = "application/json")
    public String getFoo(@PathVariable("fooId") String fooId);

}
