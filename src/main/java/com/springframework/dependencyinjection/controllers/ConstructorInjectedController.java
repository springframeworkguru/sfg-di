package com.springframework.dependencyinjection.controllers;

import com.springframework.dependencyinjection.services.GreetingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    @Autowired
    public GreetingServices greetingServices;

    public String getGreeting(){

        return greetingServices.sayGreeting();

    }
}
