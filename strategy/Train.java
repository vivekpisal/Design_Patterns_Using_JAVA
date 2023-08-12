package strategy;

import java.time.LocalDateTime;

public class Train implements BookTicket{

	@Override
	public void bookTicket(LocalDateTime dateTime, String from, String to) {
		System.out.println("Book train ticket from" + from + "to " + to);
	}

	@Override
	public int hasSeats(LocalDateTime dateTime, String from, String to) {
		return 0;
	}

}
