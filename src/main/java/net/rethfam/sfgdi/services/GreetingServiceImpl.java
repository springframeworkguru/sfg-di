package net.rethfam.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by kr on 5/30/2020.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
