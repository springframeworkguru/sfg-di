package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
    Using this to show Setter Dependency Injection, we are mimicking what the Spring Framework would be doing.
    This is NOT the way you want to be doing it.
 */

/**
 * Created by Melvyn on 10/Aug/2020
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp () {

        controller = new SetterInjectedController ();
        controller.setGreetingService (new ConstructorInjectedGreetingService ());  // Instantiating the controller object to inject
                                                                     // the new GreetingServiceImpl implementation

    }

    @Test
    void getGreeting () {
        System.out.println (controller.getGreeting ());
    }
}