package Creational.Prototype;

import java.util.HashMap;

public class ColorStore {

    private static HashMap<String,Color> colors = new HashMap<String,Color>();

    static{
        colors.put("black",new BlackColor());
        colors.put("red",new RedColor());
    }

    public static Color getColor(String color) throws CloneNotSupportedException {
        return (Color) colors.get(color).clone();
    }
}
