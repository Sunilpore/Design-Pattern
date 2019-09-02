package structural_pattern.proxy_pattern.II.query;

/*
   Proxy means filtering
   So by filtering we grant access to specific thing
   It provides the protection to the original object from the outside world.
 */

public class ProxyPatternActivity {

    public static void main(String[] args) {

        /*
          Here we filter the access of object during execution of query at run-time and throw error for "DELETE" query if it not admin.
         */

        DatabaseExecuter nonAdmin = new DatabaseExecuterProxy("NonAdmin","123");
        DatabaseExecuter admin = new DatabaseExecuterProxy("Admin","Admin@123");

        try {
            admin.executeDatabase("DELETE");
            nonAdmin.executeDatabase("DELETE");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

}
