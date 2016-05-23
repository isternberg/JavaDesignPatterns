package decorator;

import java.math.*;

public class Hotel extends VacationDecorator {

	BigDecimal price = new BigDecimal("700.98");

	protected Hotel(Vacation vacation) {
		super(vacation);
	}

	@Override
	public String getDescription() {
		return vacation.getDescription() + " Hotel";
	}

	@Override
	public BigDecimal getPrice() {
		return vacation.getPrice().add(this.price);
	}

}
