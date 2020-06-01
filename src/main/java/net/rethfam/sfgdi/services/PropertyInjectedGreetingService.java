package net.rethfam.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by kr on 5/31/2020.
 */
@Service
public class PropertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
