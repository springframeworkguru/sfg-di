package marinemaks.mmdi;

import marinemaks.mmdi.controllers.ConstructorInjectedController;
import marinemaks.mmdi.controllers.MyController;
import marinemaks.mmdi.controllers.PropertyInjectedController;
import marinemaks.mmdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MmDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(MmDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("---------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("---------- Bean");
		MyController myControllerBean = (MyController) ctx.getBean("myController");
		System.out.println(myControllerBean.sayHello());

	}

}
