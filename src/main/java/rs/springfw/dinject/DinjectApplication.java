package rs.springfw.dinject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import rs.springfw.dinject.controllers.ConstructorInjectedController;
import rs.springfw.dinject.controllers.MyController;
import rs.springfw.dinject.controllers.PropertyInjectedController;
import rs.springfw.dinject.controllers.SetterInjectedController;

@SpringBootApplication
public class DinjectApplication {

	public static void main(String[] args) {
		System.out.println("hello spring ");
		ApplicationContext ctx = SpringApplication.run(DinjectApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
		
		System.out.println("----- Primary Bean");
		System.out.println(myController.sayHello());
		
		System.out.println("-----Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController)ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-----Setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController)ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("-----Constructor");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
	}

}
