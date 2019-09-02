package creational_pattern.builder_pattern.I;

public class PhoneBuilderActivity {

    /*
        It is uesed when we have to many arguments to send via constructor & it is hard to maintain the order
        So when we don't want to send all the parameter in Object initialization
     */


    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOS("Android").setBattery(4000).getPhone();

        System.out.println(p);
    }

}
