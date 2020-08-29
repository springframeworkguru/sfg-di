package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.EnvironmentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConfigurationController {

    private final EnvironmentService environmentService;

    public ConfigurationController(@Qualifier("environmentService") EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironmentConfigRunning() {
        return environmentService.GetEnvironmentConfig();
    }

}
