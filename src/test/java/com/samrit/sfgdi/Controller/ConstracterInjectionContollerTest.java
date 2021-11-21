package com.samrit.sfgdi.Controller;

import com.samrit.sfgdi.services.ConstractorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstracterInjectionContollerTest {
    ConstracterInjectionContoller controller;


    @BeforeEach
    void setUp() {
        controller = new ConstracterInjectionContoller(new ConstractorGreetingServiceImpl());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}