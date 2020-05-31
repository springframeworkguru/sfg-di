package net.rethfam.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by kr on 5/30/2020.
 */
@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello World!!!");

        return "Hi Folks!";
    }
}
