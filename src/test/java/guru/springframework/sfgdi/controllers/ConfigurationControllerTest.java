package guru.springframework.sfgdi.controllers;

import components.ExternalComponent;
import guru.springframework.sfgdi.services.LocalEnvironmentService;
import guru.springframework.sfgdi.services.ProductionEnvironmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

class ConfigurationControllerTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getEnvironmentConfigRunning_returns_config_when_local_environment_service_used() {

        //arrange
        ConfigurationController configurationController = new ConfigurationController(new LocalEnvironmentService(), new ExternalComponent());

        //act
        String result = configurationController.getEnvironmentConfigRunning();

        //assert
        System.out.println(result);
        Assert.isTrue(result.length() > 0);
    }

    @Test
    void getEnvironmentConfigRunning_returns_config_when_production_environment_service_used() {

        //arrange
        ConfigurationController configurationController = new ConfigurationController(new ProductionEnvironmentService(), new ExternalComponent());

        //act
        String result = configurationController.getEnvironmentConfigRunning();

        //assert
        System.out.println(result);
        Assert.isTrue(result.length() > 0);
    }
}