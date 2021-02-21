package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.PropertyInjectionController;
import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SfgDiApplicationTests {

	PropertyInjectionController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectionController();

		controller.greetingService = new GreetingServiceImpl();
	}

	@Test
	void contextLoads() {
		System.out.println(controller.getGreeting());
	}

}
