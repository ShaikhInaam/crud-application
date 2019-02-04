package com.crud.application.rest.java;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource{

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String sayHello(){

        return "Hello From CRUD Application";
    }

}