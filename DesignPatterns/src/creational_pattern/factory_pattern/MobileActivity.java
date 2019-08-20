package creational_pattern.factory_pattern;

public class MobileActivity {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS os = osf.getInstanceOS("HHH");
        os.specs();

    }

}
