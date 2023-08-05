package Creational.Builder;

import Creational.Builder.Address;
import Creational.Builder.AddressBuilder;

public class Client {
	public static void main(String []args) {
		Address address = new AddressBuilder().setCity("Mumbai").setCountryName("India").setPinCode(400022).setState("Maharashtra").build();
		System.out.println(address);
	}
}
