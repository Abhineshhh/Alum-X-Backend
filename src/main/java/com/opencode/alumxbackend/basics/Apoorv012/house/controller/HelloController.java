package com.opencode.alumxbackend.basics.Apoorv012.house.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opencode.alumxbackend.basics.Apoorv012.house.service.HelloService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloController {
    
    private final HelloService helloService;

    @GetMapping()
    public String hello(@RequestParam(required = false) String name) {
        return helloService.getHelloMessage(name);
    }
    
}
