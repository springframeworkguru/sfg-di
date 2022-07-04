package com.spring.dependency_injection.controllers;

import com.spring.dependency_injection.services.GreetingsService;

public class ConstructorInjectedController {

    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
