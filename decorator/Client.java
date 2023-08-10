package decorator;

public class Client {
	public static void main(String []args) {
		Shape shape = new BlackColor(new ThickBorder(new Circle()));
		System.out.println(shape.draw());
	}
}
