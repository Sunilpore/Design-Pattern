package creational_pattern.singleton_pattern.II;

public class SingletonActivity {

    public static void main(String[] args) {

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);

        SingletonEager singletonEager1 = SingletonEager.getInstance();
        System.out.println(singletonEager1);

        /*---*/

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);


    }

}
