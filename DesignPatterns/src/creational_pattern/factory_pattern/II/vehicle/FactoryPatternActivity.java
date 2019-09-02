package creational_pattern.factory_pattern.II.vehicle;

public class FactoryPatternActivity {

    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getInstance("car",4);
        System.out.println(car.toSting());

        Vehicle bike = VehicleFactory.getInstance("bike",2);
        System.out.println(bike.toSting());
    }

}
