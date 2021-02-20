package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * Created by jt on 2/20/21.
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
