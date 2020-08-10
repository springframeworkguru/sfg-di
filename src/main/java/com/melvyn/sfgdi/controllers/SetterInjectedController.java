package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.GreetingService;
/*
    This is Constructor Dependency Injection   The preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection
 */
/**
 * Created by Melvyn on 10/Aug/2020
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService =  greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
