package com.samrit.sfgdi.services;


import org.springframework.stereotype.Service;

@Service
public class ConstractorGreetingServiceImpl implements GreetingService {


    @Override

    public String sayGreeting() {

        return "Hello world--------Constructor";
    }
}
