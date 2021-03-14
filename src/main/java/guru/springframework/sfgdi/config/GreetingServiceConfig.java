package guru.springframework.sfgdi.config;

import com.springframework.pets.CatPetService;
import com.springframework.pets.DogPetService;
import guru.springframework.sfgdi.repositories.GreetingServiceRepository;
import guru.springframework.sfgdi.repositories.GreetingServiceRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    GreetingServiceRepositoryImpl greetingServiceRepository() {
        return new GreetingServiceRepositoryImpl();
    }

    @Bean
    ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService() {
        return new PropertyInjectedGreetingService();
    }

    @Bean
    SetterInjectedGreetingService setterInjectedGreetingService() {
        return new SetterInjectedGreetingService();
    }

    @Profile("cat")
    @Bean
    CatPetService catPetService() {
        return new CatPetService();
    }

    @Profile({"dog", "default"})
    @Bean
    DogPetService dogPetService() {
        return new DogPetService();
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
