package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
// make it a spring managed controller
@Controller
public class MyController {

    private final GreetingService greetingService;

    // autowired is optional on constructor ^spring 4.2
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

//    public String sayHello(){
//        System.out.println("Hello World!!!");
//
//        return "Hi Folks!";
//    }
}
