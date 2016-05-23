package factory;

import java.math.*;

public class BusinessClassTicket implements FlightTicket {

	private String description = "Business Class Ticket";
	private BigDecimal price = new BigDecimal("570.00");

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
