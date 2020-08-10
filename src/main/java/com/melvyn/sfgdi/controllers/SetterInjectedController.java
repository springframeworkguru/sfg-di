package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
/*
    This is Constructor Dependency Injection   The preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection

    The @Qualifier is telling Spring which Bean you want to inject.
 */
/**
 * Created by Melvyn on 10/Aug/2020
 */
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService =  greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
