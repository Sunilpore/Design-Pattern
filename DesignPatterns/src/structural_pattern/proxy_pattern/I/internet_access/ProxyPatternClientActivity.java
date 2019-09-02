package structural_pattern.proxy_pattern.I.internet_access;

public class ProxyPatternClientActivity {

    public static void main(String[] args) {

        //Here we grant permission to access internet to "admin"" only

        OfficeInternetAccess access = new ProxyInternetAccess("Suraj");
        access.grantInternetAccess();

        OfficeInternetAccess access2 = new ProxyInternetAccess("admin");
        access2.grantInternetAccess();
    }

}
