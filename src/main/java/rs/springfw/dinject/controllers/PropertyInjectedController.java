package rs.springfw.dinject.controllers;

import rs.springfw.dinject.services.GreetingService;

public class PropertyInjectedController {

	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
