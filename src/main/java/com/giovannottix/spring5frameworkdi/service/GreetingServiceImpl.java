package com.giovannottix.spring5frameworkdi.service;

import org.springframework.stereotype.Service;

/**
 * Created by Giovanni Esposito.
 *
 * @since : 05/02/20, Sat
 */
@Service
public class GreetingServiceImpl implements IGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Wold";
    }
}
