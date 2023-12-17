package marinemaks.mmdi;

import marinemaks.mmdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MmDiApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(MmDiApplication.class, args);
		MyController myController = (MyController) applicationContext.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}
