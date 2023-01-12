package Dependancy.sfgdi.controllers;

import Dependancy.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {
private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
      propertyInjectedController=new PropertyInjectedController()  ;
      propertyInjectedController.greetingService=new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}