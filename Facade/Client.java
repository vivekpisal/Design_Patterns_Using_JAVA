package Structural.Facade;

public class Client {
	public static void main(String []args) {
		Address address = new Address();
		Product product = new Product();
		Payment payment = new Payment();
		Email email = new Email();
		OrderFacade orderFacade = new OrderFacade(address, payment, product, email);
		orderFacade.placeOrder();
	}
}
