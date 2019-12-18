
public class ConcertTicket extends Ticket{
	public ConcertTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public ConcertTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 100);
	}
	public ConcertTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 100);
	}
	public ConcertTicket(String eventLocation) {
		this(eventLocation, "", "01.01.2020", 100);
	}
	public ConcertTicket() {
		this("", "Event Name", "01.01.2020", 100);
	}
	public void calculateTicketPrice() {
		if (eventLocation == "München") {
			ticketPrice = basicPrice * 0.75;
		}
		else if (eventLocation == "Zenit") {
			ticketPrice = basicPrice * 1.25;
		}
		else {
			ticketPrice = basicPrice;
		}
	}
}