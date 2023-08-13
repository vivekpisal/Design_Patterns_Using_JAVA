package nullObject;

public class Car implements Vehicle{

	@Override
	public int numberOfSeats() {
		return 5;
	}

	@Override
	public String maxSpeed() {
		return "150km/h";
	}

}
