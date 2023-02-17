package com.mike.gaedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "/")
    public String helloWorld(){
        return "Hello World!";
    }

}
