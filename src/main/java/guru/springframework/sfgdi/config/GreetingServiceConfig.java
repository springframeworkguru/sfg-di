package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.PropertyGreetingService;
import guru.springframework.sfgdi.services.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by vladi on 08/09/2022
 **/
@Configuration
public class GreetingServiceConfig {
    @Bean
    ConstructorGreetingService constructorGreetingService(){
        return new ConstructorGreetingService();
    }
    @Bean
    PropertyGreetingService propertyGreetingService(){
        return new PropertyGreetingService();
    }
    @Bean
    SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }
}
