package components;

import org.springframework.stereotype.Component;

@Component
public class ExternalComponent {

    public String externalComponentTest() {
        return "test";
    }
}
