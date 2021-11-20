package guru.springframework.sfgdi.services;

public class ConstructorInjectedGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - constructorInjected";
  }
}
