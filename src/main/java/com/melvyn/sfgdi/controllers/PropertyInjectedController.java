package com.melvyn.sfgdi.controllers;
/*
    This is Property Dependency Injection   This is the least preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection

        The @Qualifier is telling Spring which Bean you want to inject.
 */

import com.melvyn.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Melvyn on 10/Aug/2020
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired // This tells Spring I want it to go ahead and inject an instance of the greetingService
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
