package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.GreetingServiceRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final GreetingServiceRepository greetingServiceRepository;

    public I18nEnglishGreetingService(GreetingServiceRepository greetingServiceRepository) {
        this.greetingServiceRepository = greetingServiceRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
