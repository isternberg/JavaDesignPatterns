package factory;

public class FlightTicketFactory {

	public FlightTicket getTicket(FlightTicketType type) {

		FlightTicket ticket = null;
		if (type == FlightTicketType.ECONOMY) {
			ticket = new EconomyClassTicket();
		} else if (type == FlightTicketType.BUSINESS) {
			ticket = new BusinessClassTicket();
		} else if (type == FlightTicketType.FIRST) {
			ticket = new FirstClassTicket();
		} else {
			throw new IllegalArgumentException();
		}
		return ticket;
	}
}
