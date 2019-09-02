package structural_pattern.facade_pattern.II;

public class FacadeActivity {

    public static void main(String[] args) {

        String test = "CheckElement";

        WebExplorerFacadeHelper.generateReports("firefox","html",test);
        WebExplorerFacadeHelper.generateReports("firefox","junit",test);
        WebExplorerFacadeHelper.generateReports("chrome","html",test);
        WebExplorerFacadeHelper.generateReports("chrome","junit",test);

    }


}
