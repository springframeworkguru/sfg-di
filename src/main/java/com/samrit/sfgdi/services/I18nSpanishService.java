package com.samrit.sfgdi.services;

//@Profile({"SP","default"})
//@Service("I18nService")
public class I18nSpanishService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Holo Rado -SP";
    }
}
