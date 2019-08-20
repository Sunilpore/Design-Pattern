package structural_pattern.adapter_pattern.mobile;

public class MobileActivity {

    /*
        Here we use adapter as intermediate to get 'Charger' instance
        Here we invoke interface object without implement it to main client class.
        In adapter class we used Composition pattern to access method call

     Example Scenario:-
        If you went at friends home and you required IOS usb but you carry normal Android usb cable,
        then you can take adapter from friend to connect usb to mobile to charge/connect the phone
     */

    public static void main(String[] args) {

        Charger ch = new ChargerAdapter();
        AssignCharger ash = new AssignCharger();
        ash.setCharger(ch);
        ash.chargeMobile("Real Me");

    }

}
