package com.melvyn.sfgdi.controllers;
/*
    This is Property Dependency Injection   This is the least preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection
 */
import com.melvyn.sfgdi.services.GreetingService;

/**
 * Created by Melvyn on 10/Aug/2020
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
