package factory;

public class App {

	public static void main(String[] args) {
		FlightTicketFactory factory = new FlightTicketFactory();
		System.out.println(factory.getTicket(FlightTicketType.ECONOMY).toString());
		System.out.println(factory.getTicket(FlightTicketType.BUSINESS).toString());
		System.out.println(factory.getTicket(FlightTicketType.FIRST).toString());
	}
}
