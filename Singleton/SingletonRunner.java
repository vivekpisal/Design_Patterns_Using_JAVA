package Creational.Singleton;

public class SingletonRunner {
    public static void main(String[] args){
        EagerSingleton obj = EagerSingleton.getInstance();
        EagerSingleton obj1 = EagerSingleton.getInstance();
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
    }
}
