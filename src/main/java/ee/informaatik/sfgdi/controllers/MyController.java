package ee.informaatik.sfgdi.controllers;

<<<<<<< HEAD
import ee.informaatik.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
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
=======
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Taavi!");
        return "Hi Folks!";
    }
}
>>>>>>> master
