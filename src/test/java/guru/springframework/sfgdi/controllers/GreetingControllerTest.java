package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ByeGreetingService;
import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.HelloGreetingService;
import guru.springframework.sfgdi.services.WhatUpGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class GreetingControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sayHello_returns_a_string_with_a_length_greater_than_zero() {

        //arrange
        GreetingController greetingController = setUpGreetingController(new HelloGreetingService());

        //act
        String result = greetingController.sayHello();

        //assert
        System.out.println(result);
        Assert.isTrue(result.length() > 0);
    }

    @Test
    void sayBye_returns_a_string_with_a_length_greater_than_zero() {

        //arrange
        ByeGreetingService byeGreetingService = new ByeGreetingService();
        GreetingController greetingController = setUpGreetingController(byeGreetingService);
        greetingController.byeGreetingService = byeGreetingService;

        //act
        String result = greetingController.sayBye();

        //assert
        System.out.println(result);
        Assert.isTrue(result.length() > 0);
    }

    @Test
    void sayWhatsUp_returns_a_string_with_a_length_greater_than_zero() {

        //arrange
        WhatUpGreetingService whatUpGreetingService = new WhatUpGreetingService();
        GreetingController greetingController = setUpGreetingController(whatUpGreetingService);
        greetingController.setGreetingServiceSetter(whatUpGreetingService);

        //act
        String result = greetingController.sayWhatsUp();

        //assert
        System.out.println(result);
        Assert.isTrue(result.length() > 0);
    }


    private GreetingController setUpGreetingController(GreetingService greetingService) {
        return new GreetingController(greetingService);
    }
}