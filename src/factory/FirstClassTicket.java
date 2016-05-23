package factory;

import java.math.*;

public class FirstClassTicket implements FlightTicket {

	private String description = "First Class Ticket";
	private BigDecimal price = new BigDecimal("990.99");

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
