package creational_pattern.factory_pattern.I.OS;

public class MobileActivity {

    public static void main(String[] args) {

        OperatingSystemFactory osf = new OperatingSystemFactory();

        OS os = osf.getInstanceOS("HHH");
        os.specs();

    }

}
