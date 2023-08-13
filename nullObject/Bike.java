package nullObject;

public class Bike implements Vehicle{

	@Override
	public int numberOfSeats() {
		return 2;
	}

	@Override
	public String maxSpeed() {
		return "140km/h";
	}
	
}
