package decorator;

import java.math.*;

public class BasicVacation implements Vacation {

	BigDecimal price = new BigDecimal("400.99");

	@Override
	public String getDescription() {
		return "Flight-Ticket";

	}

	@Override
	public BigDecimal getPrice() {
		return this.price;

	}

}
