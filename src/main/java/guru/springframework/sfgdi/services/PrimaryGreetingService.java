package guru.springframework.sfgdi.services;

/**
 * Created by vladi on 12/08/2022
 **/
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean!";
    }

    public void myPrimaryBeforeInit() {
        System.out.println("## - PrimaryGreetingService :: Before Init - Called by Bean Post Processor");
    }
}
