package com.bizforo.sfgdi.controllers;

import com.bizforo.sfgdi.SfgDiApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello World!");

        return "Hello Forks.";
    }
}
