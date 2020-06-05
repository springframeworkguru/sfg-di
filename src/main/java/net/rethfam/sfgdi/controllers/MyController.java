package net.rethfam.sfgdi.controllers;

import net.rethfam.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by kr on 5/30/2020.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
