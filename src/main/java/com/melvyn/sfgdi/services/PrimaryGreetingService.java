package com.melvyn.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by Melvyn on 10/Aug/2020
 */
/*
    @Primary defines this as the primary bean to be used if Di cannot decide which Bean to use
    @Qualifier will take precedence over @Primary
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting () {

        return "Hello World - From the PRIMARY Bean";
    }
}
