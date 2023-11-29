package guru.springframework.sfgdi.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeBean
{
    public PrototypeBean(){
        System.out.println("Im a prototype bean just created");
    }

    public String getMyScope(){
        return "Prototype bean say Helllo!";
    }
}


