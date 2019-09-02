package creational_pattern.factory_pattern.II.vehicle;

public abstract class Vehicle {
    public abstract int getWheel();

    public String toSting(){
        return "Wheel: "+this.getWheel();
    }
}
