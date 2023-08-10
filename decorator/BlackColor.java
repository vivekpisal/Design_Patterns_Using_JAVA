package decorator;

public class BlackColor implements Shape{
	
	Shape shape;
	
	public BlackColor(Shape shape) {
		super();
		this.shape = shape;
	}

	@Override
	public String draw() {
		return "black color "+shape.draw();
	}
	
}
