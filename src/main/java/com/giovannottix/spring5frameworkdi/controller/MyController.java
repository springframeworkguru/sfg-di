package com.giovannottix.spring5frameworkdi.controller;

import org.springframework.stereotype.Component;

@Component
public class MyController {
    public String sayHello() {
        System.out.println("Hello World");

        return "Hey Joe!";
    }
}
