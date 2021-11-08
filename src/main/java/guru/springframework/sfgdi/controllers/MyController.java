package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

  public String sayHello() {
    System.out.println("Hello $10,000,000,000");

    return "Hi Folks!";
  }
}
