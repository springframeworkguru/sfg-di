package rs.springfw.dinject.controllers;

import rs.springfw.dinject.services.GreetingService;

public class SetterInjectedController {

	private GreetingService greetingService;
	
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
