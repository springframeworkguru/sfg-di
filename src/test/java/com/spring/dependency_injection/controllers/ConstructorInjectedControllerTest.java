package com.spring.dependency_injection.controllers;

import com.spring.dependency_injection.services.ConstructorGreetingsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingsService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}