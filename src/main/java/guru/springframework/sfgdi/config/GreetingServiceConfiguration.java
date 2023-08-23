package guru.springframework.sfgdi.config;


import guru.springframework.pets.CatPetService;
import guru.springframework.pets.DogPetService;
import guru.springframework.pets.PetService;
import guru.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sdgdi-config.xml")
@Configuration
public class GreetingServiceConfiguration {

    //@Bean
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

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService() {
        return new PrimaryGreetingService();
    }


    @Profile({"ES", "default"})
    @Bean(name = "i18nService")
    I18NSpanishService i18NSpanishService() {
        return new I18NSpanishService();
    }


    @Profile("EN")
    @Bean
    I18nEnglishGreetingService i18nService() {
        return new I18nEnglishGreetingService(englishGreetingRepository());
    }
    @Bean
    EnglishGreetingRepository englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Bean
    PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean
    PetService dogPetService() {
        return new PetServiceFactory().getPetService("dog");
    }

    @Profile("cat")
    @Bean
    PetService catPetService() {
        return new PetServiceFactory().getPetService("cat");
    }
}
