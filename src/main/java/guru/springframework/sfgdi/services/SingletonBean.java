package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletonBean {
    public SingletonBean(){
        System.out.println("Im a singleton bean just created");
    }

    public String getMyScope(){
        return "Singleton bean say Hiiiiii!";
    }
}
