package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/*
    Using this to show Property Dependency Injection, we are mimicking what the Spring Framework would be doing.
    This is NOT the way you want to be doing it.
 */

/**
 * Created by Melvyn on 10/Aug/2020
 */
class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setup() {
        controller = new PropertyInjectedController ();          // Creating the object
        controller.greetingService = new GreetingServiceImpl (); // Creating the instance
    }

    @Test
    void getGreeting () {
        System.out.println (controller.getGreeting ());
    }
}