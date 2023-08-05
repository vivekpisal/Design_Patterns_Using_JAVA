package Creational.Singleton;

public class LazySingleton {

    private static  LazySingleton obj;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if(obj == null){
            obj = new LazySingleton();
        }
        return obj;
    }
}
