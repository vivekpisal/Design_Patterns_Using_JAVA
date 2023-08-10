package decorator;

public class RedColor implements Shape{

	Shape shape;
	
	public RedColor(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public String draw() {
		return "red color "+shape.draw();
	}
}
