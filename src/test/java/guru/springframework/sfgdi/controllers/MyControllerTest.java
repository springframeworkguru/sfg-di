package guru.springframework.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.PrimaryGreetingService;

public class MyControllerTest {

    MyController controller;

    @BeforeEach
    void setUp() {
        controller = new MyController(new PrimaryGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.sayHello());
    }
}