package com.samrit.sfgdi.Controller;

import com.samrit.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final PrimaryGreetingService primaryGreetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.primaryGreetingService = primaryGreetingService;
    }


    public String printHello(){

        System.out.println("Hello World");

        return  primaryGreetingService.sayGreeting();
    }
}
