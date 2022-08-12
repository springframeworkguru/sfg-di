package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

        System.out.println("------------ Profiler");
        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.sayHello());

        MyController myController = (MyController) context.getBean("myController");

        System.out.println("------------ Primary Bean");

        System.out.println(myController.sayHello());

        System.out.println("------------ Property ");

        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) context.getBean("propertyInjectionController");

        System.out.println(propertyInjectionController.getGreeting());

        System.out.println("------------ Setter ");

        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");

        System.out.println(setterInjectedController.getGreeting());

        System.out.println("------------ Constructor ");

        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");

        System.out.println(constructorInjectedController.getGreeting());


    }

}
