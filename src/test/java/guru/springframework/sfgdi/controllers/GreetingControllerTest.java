package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.HelloGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class GreetingControllerTest {

    private GreetingController greetingController;

    @BeforeEach
    void setUp() {
        greetingController = new GreetingController(new HelloGreetingService());
    }

    @Test
    void sayHello_returns_hello_text() {
        String result = greetingController.sayHello();
        System.out.println(result);
        Assert.hasText(result,"Hello!");
    }
}