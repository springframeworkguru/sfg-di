package rs.springfw.dinject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import rs.springfw.dinject.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	ContructorInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new ContructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}
}
