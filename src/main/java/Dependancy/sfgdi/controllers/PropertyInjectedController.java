package Dependancy.sfgdi.controllers;

import Dependancy.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
    //allo les amies
}
