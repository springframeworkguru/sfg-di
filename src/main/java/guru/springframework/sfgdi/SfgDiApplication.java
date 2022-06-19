package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		// sping app scans for classes that have been registered as beans. (controllers, components, service etc)
		// rtns app context
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		// then we can request an instance of our controller
		// we are not creating a 'new' controller, we're asking spring to provide an instance.
		// it takes that responsibility
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("========= @Primary constructo inj ===");

		System.out.println(myController.getGreeting());

		System.out.println("========= property inj ===");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("========= setter inj ===");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("========= constructor inj ===");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("========= i18n profile ====");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

	}

}
