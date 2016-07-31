package decorator;

import java.math.*;

public class BasicVacation implements Vacation {

	private BigDecimal price;
	private String description;

	public BasicVacation() {
		price = new BigDecimal("400.99");
		description = "Flight-Ticket";
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public BigDecimal getPrice() {
		return this.price;
	}

}
