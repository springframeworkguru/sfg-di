package guru.springframework.sfgdi.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by jt on 7/25/18.
 */
@Component
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside Data loader");
    }
}
