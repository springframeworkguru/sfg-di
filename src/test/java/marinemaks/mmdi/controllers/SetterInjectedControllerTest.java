package marinemaks.mmdi.controllers;

import marinemaks.mmdi.services.HelloWorldGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();

        controller.setGreetingService(new HelloWorldGreetingService());
    }

    @Test
    void getGreeting() {

        assertEquals("Hello World!", controller.getGreeting());
    }

}