package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

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
