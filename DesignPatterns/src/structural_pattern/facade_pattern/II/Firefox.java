package structural_pattern.facade_pattern.II;

public class Firefox {

    public static Driver getFirefoxDriver(){
        return null;
    }

    public static void generateHTMLReport(String test, Driver driver){
        System.out.println("Generating HTML report for Firefox Driver");
    }

    public static void generateJUnitReport(String test, Driver driver){
        System.out.println("Generating JUNIT report for Firefox Driver");
    }

}
