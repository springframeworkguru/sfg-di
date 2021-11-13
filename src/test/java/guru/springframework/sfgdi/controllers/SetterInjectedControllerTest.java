package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

  SetterInjectedController controller;

  @BeforeEach
  void setUp() {
    controller = new SetterInjectedController();
    controller.setGreetingService(new ConstructorInjectedGreetingService());
  }

  @Test
  void getGreeting() {
    System.out.println(controller.getGreeting() + "by setter");
  }
}
