package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repository.GreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final GreetingRepository greetingRepository;

    public I18nEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN /// " + greetingRepository.getGreeting() ;
    }
}
