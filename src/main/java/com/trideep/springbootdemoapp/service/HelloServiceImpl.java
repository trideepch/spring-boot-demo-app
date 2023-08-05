package com.trideep.springbootdemoapp.service;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String indexService() {
        return "Greetings from TC!";
    }
}
