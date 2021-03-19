package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

/**
 * User: p_sha
 * Date: Fri 19 Mar 2021
 */
@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println(">>>> Creating SingletonBean");
    }

    public String getScope() {
        return "SingletonBean.getScope called.";
    }
}

