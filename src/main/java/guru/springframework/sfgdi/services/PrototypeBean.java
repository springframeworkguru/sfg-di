package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * User: p_sha
 * Date: Fri 19 Mar 2021
 */
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PrototypeBean{

    public PrototypeBean() {
        System.out.println(">>>> Creating PrototypeBean");
    }

    public String getScope() {
        return "PrototypeBean.getScope called.";
    }

}
