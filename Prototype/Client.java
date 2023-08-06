package Creational.Prototype;

public class Client {
    public static void main(String []args) throws CloneNotSupportedException {
        Color red = ColorStore.getColor("red");
        System.out.println(red.getHexValue());
        Color black = ColorStore.getColor("black");
        System.out.println(black.getHexValue());
    }
}
