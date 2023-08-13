package nullObject;

public class NullObject implements Vehicle{

	@Override
	public int numberOfSeats() {
		return 0;
	}

	@Override
	public String maxSpeed() {
		return "";
	}

}
