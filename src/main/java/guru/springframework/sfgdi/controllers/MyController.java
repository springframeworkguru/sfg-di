package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by jt on 12/26/19.
 */
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
