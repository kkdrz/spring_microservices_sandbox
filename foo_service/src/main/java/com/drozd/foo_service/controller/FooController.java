package com.drozd.foo_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/v1/foo/")
public class FooController {

    Logger log = LoggerFactory.getLogger(FooController.class);

    @RequestMapping(
            path = "/{fooId}",
            method = RequestMethod.GET,
            produces = "application/json")
    public String getFoo(@PathVariable String fooId) {
        log.info("Returned request: " + fooId);
        return "fooFooFOO-" + fooId;
    }
}
