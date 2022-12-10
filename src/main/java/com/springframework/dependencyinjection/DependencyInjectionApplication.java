package com.springframework.dependencyinjection;

import com.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		String greeting = constructorInjectedController.getGreeting();

		System.out.println(greeting);
	}

}
