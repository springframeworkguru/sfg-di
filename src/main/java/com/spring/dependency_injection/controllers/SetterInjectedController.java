package com.spring.dependency_injection.controllers;

import com.spring.dependency_injection.services.GreetingsService;

public class SetterInjectedController {

    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
