package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by vladi on 12/08/2022
 **/
@Controller
public class MyController {

    public  String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks";
    }
}
