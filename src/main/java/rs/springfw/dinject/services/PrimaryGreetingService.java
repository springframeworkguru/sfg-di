package rs.springfw.dinject.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World from Primay Bean";
	}

}
