package com.melvyn.sfgdi.controllers;

import com.melvyn.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Melvyn on 10/Aug/2020
 */
// Modified to demonstrate the usage of the @Primary annotation
// GreetingService now gets injected into this
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {

        return greetingService.sayGreeting ();
    }
}
//public class MyController {
//
//    public String sayHello() {
//
//        System.out.println ("Hello World!!!");
//
//        return "Hi Folks!";
//
//    }
//}
