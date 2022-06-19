package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        // inject via setter
        controller.setGreetingService(new ConstructorGreetingServiceImpl());
    }

    @Test
    void sayGreeting() {
        System.out.println(controller.getGreeting());
    }
}