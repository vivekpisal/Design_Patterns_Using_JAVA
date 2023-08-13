package nullObject;

public class VehicleFactory {
	public static Vehicle getVehicle(String vehicleType) {
		switch(vehicleType) {
			case "Bike":
				return new Bike();
			case "Car":
				return new Car();
			default:
				return new NullObject();
		}
	}
}
