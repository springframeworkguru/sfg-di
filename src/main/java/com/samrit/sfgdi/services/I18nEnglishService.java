package com.samrit.sfgdi.services;

import com.samrit.sfgdi.repositories.EngilishGreetingRepository;

//@Profile({"EN"})
//@Service("I18nService")
public class I18nEnglishService implements GreetingService{
 private final  EngilishGreetingRepository engilishGreetingRepository;

    public I18nEnglishService(EngilishGreetingRepository engilishGreetingRepository) {
        this.engilishGreetingRepository = engilishGreetingRepository;
    }


    @Override
    public String sayGreeting() {
        return engilishGreetingRepository.getGreeting();
    }
}
