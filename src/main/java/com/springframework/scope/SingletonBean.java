package com.springframework.scope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("singleton is created!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
