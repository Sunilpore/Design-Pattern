package creational_pattern.builder_pattern.II;

public class VehicleBuilder {

    String engine;
    int wheel, airbags;

    public VehicleBuilder(String engine, int wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }


    public VehicleBuilder setAirBags(int airbags){
        this.airbags = airbags;
        return this;
    }

    public Vehicle build(){
        return new Vehicle(this);
    }

}
