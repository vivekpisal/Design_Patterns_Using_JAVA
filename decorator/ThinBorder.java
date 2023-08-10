package decorator;

public class ThinBorder implements Shape{
	Shape shape;

	public ThinBorder(Shape shape) {
		super();
		this.shape = shape;
	}


	@Override
	public String draw() {
		return "Thin border "+shape.draw();
	}
}
