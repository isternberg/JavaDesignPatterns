package factory;

import java.math.*;

public class EconomyClassTicket implements FlightTicket {

	private String description = "Economy Class Ticket";
	private BigDecimal price = new BigDecimal("300.01");

	@Override
	public String getDescription() {
		return this.description;
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return this.description + ":\t" + this.price + " USD";

	}
}
