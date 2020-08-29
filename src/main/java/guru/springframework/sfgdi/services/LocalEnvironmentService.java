package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("DEV")
@Service("environmentService")
public class LocalEnvironmentService implements EnvironmentService {
    @Override
    public String GetEnvironmentConfig() {
        return "Local stack running";
    }
}
