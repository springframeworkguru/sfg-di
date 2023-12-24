package mm.di.controllers;

import mm.di.services.HelloWorldGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new HelloWorldGreetingService();
    }

    @Test
    void getGreeting() {

        assertEquals("Hello World!", controller.getGreeting());
    }
}