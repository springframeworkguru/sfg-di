package com.spring.dependency_injection;

import com.spring.dependency_injection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.spring.dependency_injection", "org.spring.pets"})
@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

        PetController petController = ctx.getBean("petController", PetController.class);
        System.out.println("### The best pet is ###");
        System.out.println(petController.whichPetIsTheBest());
        System.out.println();

        System.out.println("### Profiles ###");
        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println(i18nController.sayHello());
        System.out.println();

        System.out.println("### Primary ###");
        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.sayHello());
        System.out.println();

        System.out.println("### Property ###");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println();

        System.out.println("### Setter ###");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());
        System.out.println();

        System.out.println("### Constructor ###");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
        System.out.println();
    }

}
