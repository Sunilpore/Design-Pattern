package structural_pattern.proxy_pattern.II.query;

public class DatabaseExecuterImpl implements DatabaseExecuter {

    @Override
    public void executeDatabase(String query) throws Exception {
        System.out.println("Going to execute Query: "+query);
    }

}
