package com.opencode.alumxbackend.basics.Apoorv012.house.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    
    public String getHelloMessage(String name) {
        if (name == null || name.isBlank()) {
            return "Hello, there!";
        }
        
        return "Hello, " + name + "!";
    }
}
