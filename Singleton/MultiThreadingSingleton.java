package Creational.Singleton;

public class MultiThreadingSingleton {
    private static MultiThreadingSingleton obj;
    private MultiThreadingSingleton(){}

    public static MultiThreadingSingleton getInstance(){
        if(obj == null){
            synchronized (MultiThreadingSingleton.class){
                if(obj == null){
                    obj = new MultiThreadingSingleton();
                }
            }
        }
        return obj;
    }
}
