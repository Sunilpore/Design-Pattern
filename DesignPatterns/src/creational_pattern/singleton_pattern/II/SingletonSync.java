package creational_pattern.singleton_pattern.II;

public class SingletonSync {

    private static SingletonSync insatnce;

    private SingletonSync() {}

    /*It is Thread safe.
     It will allow single thread to access at a time while other thread will wait.
     */
    public static synchronized SingletonSync getSingletonSync(){
        if(insatnce == null){
            insatnce = new SingletonSync();
        }
        return insatnce;
    }


    /**
     * Here we make synchronized block instead of method
     * @return
     */
    public static SingletonSync getBlockInsatnce(){

        //If thread found instance null then enter into synchronized block
        if(insatnce==null){

            //Here it will enter sync block wait till  obj is create and create new instance if found to be null;
            synchronized (SingletonSync.class){
                if(insatnce==null){
                    insatnce = new SingletonSync();
                }
            }
        }
        return insatnce;
    }

}
