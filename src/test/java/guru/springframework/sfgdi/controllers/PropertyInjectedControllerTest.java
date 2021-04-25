package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting(){
        System.out.println(propertyInjectedController.getGreeting());
    }

}