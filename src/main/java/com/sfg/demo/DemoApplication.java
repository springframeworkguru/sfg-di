package com.sfg.demo;

import com.sfg.demo.controller.ConstructorInjectedController;
import com.sfg.demo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String msg = myController.sayHello();

        System.out.println(msg);


		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		String msg1 = constructorInjectedController.getGreetings();
		System.out.println(msg1);

	}

}
