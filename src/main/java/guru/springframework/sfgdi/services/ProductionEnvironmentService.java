package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"default","PROD"})
@Service("environmentService")
public class ProductionEnvironmentService implements EnvironmentService {
    @Override
    public String GetEnvironmentConfig() {
        return "Production stack running";
    }
}
