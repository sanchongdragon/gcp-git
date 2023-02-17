package com.mike.gaedemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

    @GetMapping(value = "/")
    public String helloWorld(){
        LOG.info("hello world method has been called!");
        return "Hello World!";
    }

}
