package com.melvyn.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Melvyn on 10/Aug/2020
 */
@Controller
public class MyController {

    public String sayHello() {

        System.out.println ("Hello World!!!");

        return "Hi Folks!";

    }
}
