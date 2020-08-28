package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    //Property based injection with spring
    @Autowired
    public GreetingService greetingServiceProperty;

    private  GreetingService greetingServiceSetter;

    //Setter based injection
    @Autowired
    public void setGreetingServiceSetter(GreetingService greetingServiceSetter) {
        this.greetingServiceSetter = greetingServiceSetter;
    }

    //ctor injected no @autoWired annotation required.
    public  GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;

    }

    public String sayHello() {
        return greetingService.sayHello();
    }

    public String sayBye() {
        return greetingServiceProperty.sayBye();
    }

    public String sayWhatsUp() {
        return greetingServiceSetter.sayWhatsUP();
    }

}
