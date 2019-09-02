package creational_pattern.singleton_pattern.II;

public class Singleton {

    private static Singleton instance;

    private Singleton(){}


    /*It is not thred safe. Multiple Threads can access it run time.
    Means if two classes or thread create Singleton object at same time,
    then there may be possibility one class create an instance while other class get null instance.So it will again generate new instance of it.*/
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

}
