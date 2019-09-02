package structural_pattern.proxy_pattern.I.internet_access;

public class RealInternetAccess implements OfficeInternetAccess{

    private String employeeName;

    public RealInternetAccess(String empName) {
        this.employeeName = empName;
    }

    @Override
    public void grantInternetAccess() {
        System.out.println("Internet Access granted for employee: "+ employeeName);
    }

}
