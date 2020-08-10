package com.melvyn.sfgdi.controllers;
/*
    This is Constructor Dependency Injection   The preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection
 */

import com.melvyn.sfgdi.services.GreetingService;

/**
 * Created by Melvyn on 10/Aug/2020
 */

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
