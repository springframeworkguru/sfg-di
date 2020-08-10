package com.melvyn.sfgdi.controllers;
/*
    This is Constructor Dependency Injection   The preferred method if not using Spring Framework DI
    It is NOT Spring Framework Dependency Injection

    The @Qualifier is telling Spring which Bean you want to inject.
 */

import com.melvyn.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Created by Melvyn on 10/Aug/2020
 */

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

//  @Autowired -  Latest version of Spring no longer requires this on constructors, you can specify it if you want to.
    public ConstructorInjectedController (@Qualifier("constructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting ();
    }
}
