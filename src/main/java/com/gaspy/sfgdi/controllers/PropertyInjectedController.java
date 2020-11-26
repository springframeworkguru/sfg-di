package com.gaspy.sfgdi.controllers;

import com.gaspy.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.saygreeting();
    }
}
