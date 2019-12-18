
public class Ticket_Classs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SportTicket st1 = new SportTicket("HTL Sporttunier");
		st1.output();
		SportTicket st2 = new SportTicket("Turnsaal", "1.Klasse vs 2.Klasse");
		st2.output();
		ConcertTicket ct1 = new ConcertTicket("Zenit", "RAF CAMORA", "21.2.2019");
		ct1.output();
		ConcertTicket ct2 = new ConcertTicket("München", "RAF", "21.2.2019", 50);
		ct2.output();
		TheaterTicket tt1 = new TheaterTicket();
		tt1.output();
		TheaterTicket tt2 = new TheaterTicket("Theater Innsbruck");
		tt2.output();
	}

}
