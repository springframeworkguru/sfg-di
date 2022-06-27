package ee.informaatik.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello Taavi!");
        return "Hi Folks!";
    }
}