package strategy;

import java.time.LocalDateTime;

public class Flight implements BookTicket{

	@Override
	public void bookTicket(LocalDateTime dateTime, String from, String to) {
		System.out.println("Book flight ticket from" + from + "to " + to);
	}

	@Override
	public int hasSeats(LocalDateTime dateTime, String from, String to) {
		// TODO Auto-generated method stub
		return 0;
	}

}
