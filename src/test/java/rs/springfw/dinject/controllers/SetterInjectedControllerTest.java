package rs.springfw.dinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.springfw.dinject.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
