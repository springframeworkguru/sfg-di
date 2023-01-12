package Dependancy.sfgdi.controllers;

import Dependancy.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ConstructorInjectedController {
    private final GreetingService greetingService;
    public  ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService){
        this.greetingService=greetingService;
    }


    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
