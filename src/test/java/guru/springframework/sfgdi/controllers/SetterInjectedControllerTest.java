package guru.springframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.services.GreetingServiceImpl;

class SetterInjectedControllerTest
{
    SetterInjectedController controller;

    @BeforeEach
    void setUp()
    {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting()
    {
        System.out.println(controller.getGreeting());
    }
}
