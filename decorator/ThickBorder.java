package decorator;

public class ThickBorder implements Shape{
	Shape shape;
	
	public ThickBorder(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public String draw() {
		return "Thick border "+shape.draw();
	}
}
