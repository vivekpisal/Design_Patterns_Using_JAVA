package strategy;

import java.time.LocalDateTime;

public class Client {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2023, 8, 15, 9, 15);
		BookTicket bookTicket = new Flight();
		bookTicket.bookTicket(dateTime,"Mumbai","Goa");
	}

}
