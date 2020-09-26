package guru.springframework.sfgdi.controllers;

import components.ExternalComponent;
import guru.springframework.sfgdi.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConfigurationController {

    private final EnvironmentService environmentService;
    private final ExternalComponent externalComponent;

    public ConfigurationController(@Qualifier("environmentService") EnvironmentService environmentService, ExternalComponent externalComponent) {
        this.environmentService = environmentService;
        this.externalComponent = externalComponent;
    }

    public String getEnvironmentConfigRunning() {
        return environmentService.GetEnvironmentConfig();
    }

}
