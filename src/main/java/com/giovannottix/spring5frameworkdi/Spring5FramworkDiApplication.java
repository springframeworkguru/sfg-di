package com.giovannottix.spring5frameworkdi;

import com.giovannottix.spring5frameworkdi.controller.ConstructorInjectedController;
import com.giovannottix.spring5frameworkdi.controller.MyController;
import com.giovannottix.spring5frameworkdi.controller.PropertyInjectedController;
import com.giovannottix.spring5frameworkdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5FramworkDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =
				SpringApplication.run(Spring5FramworkDiApplication.class,
				args);

		MyController myController = (MyController) ctx.getBean("myController");
		String greetings = myController.sayHello();

		System.out.println(greetings);

		System.out.println("----- DI with Spring by property");
		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean(
						"propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- DI with Spring by setter");
		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean(
						"setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("----- DI with Spring by constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean(
						"constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
