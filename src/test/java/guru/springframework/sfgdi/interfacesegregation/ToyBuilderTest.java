package guru.springframework.sfgdi.interfacesegregation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToyBuilderTest {

    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse=ToyBuilder.buildToyHouse();
        System.out.println(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar=ToyBuilder.buildToyCar();;
        System.out.println(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane=ToyBuilder.buildToyPlane();
        System.out.println(toyPlane);
    }
}