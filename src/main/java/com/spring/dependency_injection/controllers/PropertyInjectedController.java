package com.spring.dependency_injection.controllers;

import com.spring.dependency_injection.services.GreetingsService;

public class PropertyInjectedController {

    public GreetingsService greetingsService;

    public String getGreeting() {
        return greetingsService.sayGreetings();
    }
}
