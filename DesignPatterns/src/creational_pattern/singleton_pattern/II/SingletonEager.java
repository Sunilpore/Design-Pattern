package creational_pattern.singleton_pattern.II;

/*
    Eager Initialization
 */

public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstance(){
        return instance;
    }

}
