package guru.springframework.sfgdi.interfacesegregation;

public class ToyBuilder {

    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("green");
        return toyHouse;
    }
    public static ToyCar buildToyCar(){
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("red");
        toyCar.move();
        return toyCar;
    }
    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(25.00);
        toyPlane.setColor("red");
        toyPlane.fly();
        return toyPlane;
    }
}
