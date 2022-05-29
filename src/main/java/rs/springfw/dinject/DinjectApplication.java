package rs.springfw.dinject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import rs.springfw.dinject.controllers.MyController;
import rs.springfw.dinject.controllers.PropertyInjectedController;
import rs.springfw.dinject.controllers.SetterInjectedController;
import rs.springfw.dinject.services.GreetingServiceImpl;

@SpringBootApplication
public class DinjectApplication {

	public static void main(String[] args) {
		System.out.println("hello spring ");
		ApplicationContext ctx = SpringApplication.run(DinjectApplication.class, args);
		
		MyController myController = (MyController)ctx.getBean("myController");
		
		String greeting = myController.sayHello();
		
		System.out.println(greeting);

	}

}
