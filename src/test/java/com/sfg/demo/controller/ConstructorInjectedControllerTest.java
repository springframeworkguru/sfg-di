package com.sfg.demo.controller;

import com.sfg.demo.service.GreetingService;
import com.sfg.demo.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }


    @Test
    void getGreetings(){
        System.out.println(controller.getGreetings());
    }

}