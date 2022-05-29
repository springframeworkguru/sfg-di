package rs.springfw.dinject.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import rs.springfw.dinject.services.GreetingService;

@Controller
public class I18nController {
	
	public final GreetingService greetingService;
	
	public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
}
