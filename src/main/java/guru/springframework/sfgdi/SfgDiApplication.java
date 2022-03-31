package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(SfgDiApplication.class, args);
		MyController myController=(MyController)applicationContext.getBean("myController");
		String ret=myController.sayHello();
		System.out.println(ret);

		System.out.println("-----------Property");
		PropertyInjectedController property=(PropertyInjectedController)applicationContext.getBean("propertyInjectedController");
		System.out.println(property.getGreeting());

		System.out.println("-----------Setter");
		SetterInjectedController setter=(SetterInjectedController)applicationContext.getBean("setterInjectedController");
		System.out.println(setter.getGreeting());

		System.out.println("-----------Constructor");
		ConstructorInjectedController constructor=(ConstructorInjectedController)applicationContext.getBean("constructorInjectedController");
		System.out.println(constructor.getGreeting());
	}
}
