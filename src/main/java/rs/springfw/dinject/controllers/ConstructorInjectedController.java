package rs.springfw.dinject.controllers;

import org.springframework.stereotype.Controller;

import rs.springfw.dinject.services.GreetingService;

@Controller
public class ConstructorInjectedController {

	private final GreetingService greetingService;
	
//	@Autowired is not required on the constructor
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
