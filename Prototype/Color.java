package Creational.Prototype;

public abstract class Color implements Cloneable{

    public String color;

    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    public abstract String getHexValue();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
