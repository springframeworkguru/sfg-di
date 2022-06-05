package rs.springfw.dinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.springfw.dinject.services.ConstructorGreetingServiceImpl;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingServiceImpl();
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.greetingService.sayGreeting());
	}
}
