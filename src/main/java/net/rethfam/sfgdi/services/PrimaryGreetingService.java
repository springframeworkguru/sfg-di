package net.rethfam.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by kr on 5/31/2020.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From the Primary Bean";
    }
}
