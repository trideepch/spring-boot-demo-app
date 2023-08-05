package com.trideep.springbootdemoapp.controller;

import com.trideep.springbootdemoapp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;
    @GetMapping("/")
    public String index() {
        return helloService.indexService();
    }
}