package creational_pattern.factory_pattern.II.vehicle;

public class Car extends Vehicle {
    int wheel;

    public Car(int wheel) {
        this.wheel = wheel;
    }

    @Override
    public int getWheel() {
        return this.wheel;
    }


}
