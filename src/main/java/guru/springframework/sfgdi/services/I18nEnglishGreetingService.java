package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.inject.Inject;

@RequiredArgsConstructor(onConstructor = @__(@Inject))
public class I18nEnglishGreetingService implements GreetingService {

  private final @NonNull EnglishGreetingRepository englishGreetingRepository;

  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
