package guru.springframework.sfgdi.config;

import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@ImportResource("classpath:stgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

  @Bean FakeDataSource fakeDataSource(
      @Value("${datasource.username}") String username,
      @Value("${datasource.password}") String password,
      @Value("${datasource.jdbcurl}") String jdbcurl) {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setUsername(username);
    fakeDataSource.setPassword(password);
    fakeDataSource.setJdbcurl(jdbcurl);

    return fakeDataSource;
  }

  @Bean
  PetServiceFactory petServiceFactory() {
    return new PetServiceFactory();
  }

  @Profile({ "dog", "default" })
  @Bean
  PetService dogPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("dog");
  }

  @Profile("cat")
  @Bean
  PetService catPetService(PetServiceFactory petServiceFactory) {
    return petServiceFactory.getPetService("cat");
  }

  @Profile({ "ES", "default" })
  @Bean("i18nService")
  I18nSpanishGreetingService i18nSpanishGreetingService() {
    return new I18nSpanishGreetingService();
  }

  @Bean EnglishGreetingRepository englishGreetingRepository() {
    return new EnglishGreetingRepositoryImpl();
  }

  @Profile("EN")
  @Bean
  I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository) {
    return new I18nEnglishGreetingService(englishGreetingRepository);
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
}
