package structural_pattern.facade_pattern.II;

public class Chrome {

    public static Driver getChromeDriver(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML report for Chrome Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUNIT report for Chrome Driver");
    }

}
