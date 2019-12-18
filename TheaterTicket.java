
public class TheaterTicket extends Ticket{
	public TheaterTicket(String eventLocation, String eventName, String date, double basicPrice) {
		setEventLocation(eventLocation);
		setEventName(eventName);
		setDate(date);
		setBasicPrice(basicPrice);
		calculateTicketPrice();
	}
	public TheaterTicket(String eventLocation, String eventName, String date) {
		this(eventLocation, eventName, date, 20);
	}
	public TheaterTicket(String eventLocation, String eventName) {
		this(eventLocation, eventName, "01.01.2020", 20);
	}
	public TheaterTicket(String eventLocation) {
		this(eventLocation, "", "01.01.2020", 20);
	}
	public TheaterTicket() {
		this("", "", "01.01.2020", 20);
	}
	public void calculateTicketPrice() {
		if (eventLocation == "Landestheater") {
			ticketPrice = basicPrice * 0.5;
		}
		else if (eventLocation == "Theater Innsbruck") {
			ticketPrice = basicPrice * 1.5;
		}
		else {
			ticketPrice = basicPrice;
		}
	}
}