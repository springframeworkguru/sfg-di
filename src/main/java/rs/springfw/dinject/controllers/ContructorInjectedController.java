package rs.springfw.dinject.controllers;

import rs.springfw.dinject.services.GreetingService;

public class ContructorInjectedController {

	private final GreetingService greetingService;
	
	public ContructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
