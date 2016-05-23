package factory;

public class App {

	public static void main(String[] args) {
		FlightTicketFactory factory = new FlightTicketFactory();
		String info = "";
		info = factory.getTicket(FlightTicketType.ECONOMY).toString();
		System.out.println(info);
		info = factory.getTicket(FlightTicketType.BUSINESS).toString();
		System.out.println(info);
		info = factory.getTicket(FlightTicketType.FIRST).toString();
		System.out.println(info);
	}
}
