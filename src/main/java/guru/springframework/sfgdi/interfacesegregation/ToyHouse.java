package guru.springframework.sfgdi.interfacesegregation;

import guru.springframework.sfgdi.interfaces.Toy;

public class ToyHouse implements Toy {

    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
