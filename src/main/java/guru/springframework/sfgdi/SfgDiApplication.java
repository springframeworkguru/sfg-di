package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConfigurationController;
import guru.springframework.sfgdi.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"components","guru.springframework.sfgdi"})
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		GreetingController greetingController = (GreetingController)ctx.getBean("greetingController");
		System.out.println(greetingController.sayHello());
		System.out.println(greetingController.sayBye());
		System.out.println(greetingController.sayWhatsUp());

		ConfigurationController configurationController = (ConfigurationController)ctx.getBean("configurationController");
		System.out.println(configurationController.getEnvironmentConfigRunning());

	}

}
