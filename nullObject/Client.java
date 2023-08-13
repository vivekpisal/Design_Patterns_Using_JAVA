package nullObject;

public class Client {
	public static void main(String []args) {
		Vehicle vehicle = VehicleFactory.getVehicle("Bus");
		System.out.println(vehicle.numberOfSeats());
		System.out.println(vehicle.maxSpeed());
	}
}
