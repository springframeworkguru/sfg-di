package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
    Using this to show Constructor Dependency Injection, we are mimicking what the Spring Framework would be doing.
    This is NOT the way you want to be doing it.
 */
/**
 * Created by Melvyn on 10/Aug/2020
 */
class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp () {
        // We are creating the new ConstructorInjectedController and implementing the GreetingServiceImpl service
        controller = new ConstructorInjectedController (new GreetingServiceImpl ());
    }

    @Test
    void getGreeting () {

        System.out.println (controller.getGreeting ());
    }
}