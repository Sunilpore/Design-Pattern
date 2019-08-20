package creational_pattern.factory_pattern;

public class Windows implements OS {

    @Override
    public void specs() {
        System.out.println("I am out of scope");
    }

}
