package Structural.Facade;

public class OrderFacade {
	private Address address;
	private Payment payment;
	private Product product;
	private Email email;
	
	public OrderFacade() {
		super();
	}

	public OrderFacade(Address address, Payment payment, Product product, Email email) {
		super();
		this.address = address;
		this.payment = payment;
		this.product = product;
		this.email = email;
	}

	public void placeOrder() {
		product.getProduct();
		address.setAddress(0);
		payment.makePayment(200);
		email.confirmOrderEmail(0, 0);
	}
}
