package strategy;

import java.time.LocalDateTime;

public interface BookTicket {
	void bookTicket(LocalDateTime dateTime,String from,String to);
	int hasSeats(LocalDateTime dateTime,String from,String to);
}
