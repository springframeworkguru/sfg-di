package marinemaks.mmdi.controllers;

import marinemaks.mmdi.services.HelloWorldGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new HelloWorldGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello World!", controller.getGreeting());
    }
}