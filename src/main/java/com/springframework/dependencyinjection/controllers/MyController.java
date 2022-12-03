package com.springframework.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String sayHello(){

        System.out.println("Hello there!!!");

        return "Hi from controller bean ";
    }
}
