package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {

    private final GreetingService helloGreetingService;

    //Property based injection with spring
    @Qualifier("byeGreetingService")
    @Autowired
    public GreetingService byeGreetingService;

    private  GreetingService whatsUpGreetingService;

    //Setter based injection
    @Qualifier("whatUpGreetingService")
    @Autowired
    public void setGreetingServiceSetter(GreetingService greetingServiceSetter) {
        this.whatsUpGreetingService = greetingServiceSetter;
    }

    //ctor injected no @autoWired annotation required.
    public  GreetingController(GreetingService greetingService) {
        this.helloGreetingService = greetingService;

    }

    public String sayHello() {
        return helloGreetingService.sayGreeting();
    }

    public String sayBye() {
        return byeGreetingService.sayGreeting();
    }

    public String sayWhatsUp() {
        return whatsUpGreetingService.sayGreeting();
    }

}
