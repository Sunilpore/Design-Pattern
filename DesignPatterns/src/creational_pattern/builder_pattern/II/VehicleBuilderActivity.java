package creational_pattern.builder_pattern.II;

public class VehicleBuilderActivity {


    public static void main(String[] args) {


        //Here design builder with 2 reqired and with one optional parameter
        Vehicle car = new VehicleBuilder("1500cc",4).setAirBags(4).build();
        Vehicle bike = new VehicleBuilder("250cc",2).build();

        System.out.println(car);
        System.out.println(bike);
    }

}
