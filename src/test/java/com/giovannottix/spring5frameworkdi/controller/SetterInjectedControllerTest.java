package com.giovannottix.spring5frameworkdi.controller;

import com.giovannottix.spring5frameworkdi.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setup(){
        controller = new SetterInjectedController();

        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
        Assert.isTrue(("Hello Wold").equals(controller.getGreeting()),
                "The String are different");
    }

}