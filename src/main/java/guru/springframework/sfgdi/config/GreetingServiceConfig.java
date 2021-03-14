package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.GreetingServiceRepository;
import guru.springframework.sfgdi.repositories.GreetingServiceRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile("cat")
    @Bean
    PetService catPetService() {
        return petServiceFactory().getPetService("cat");
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService() {
        return petServiceFactory().getPetService("dog");
    }

    @Bean
    GreetingServiceRepositoryImpl greetingServiceRepository() {
        return new GreetingServiceRepositoryImpl();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

//    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService(GreetingServiceRepository greetingServiceRepository) {
        return new I18nEnglishGreetingService(greetingServiceRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }
}
