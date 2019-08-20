package creational_pattern.builder_pattern;

public class PhoneBuilderActivity {

    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOS("Android").setBattery(4000).getPhone();

        System.out.println(p);
    }

}
