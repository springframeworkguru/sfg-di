package net.rethfam.sfgdi.controllers;

import net.rethfam.sfgdi.services.GreetingService;

/**
 * Created by kr on 5/30/2020.
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
