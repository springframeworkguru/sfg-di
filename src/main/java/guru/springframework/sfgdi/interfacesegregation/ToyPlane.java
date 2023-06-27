package guru.springframework.sfgdi.interfacesegregation;

import guru.springframework.sfgdi.interfaces.Flyable;
import guru.springframework.sfgdi.interfaces.Toy;

public class ToyPlane implements Toy, Flyable {

    double price;
    String color;
    @Override
    public void fly() {
        System.out.println("FLYYYYYYYYYYYYYYYYYY");
    }

    @Override
    public void setPrice(double price) {
        this.price=price;

    }

    @Override
    public void setColor(String color) {
        this.color=color;

    }

    @Override
    public String toString() {
        return "ToyPlane{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
