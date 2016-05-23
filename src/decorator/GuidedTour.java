package decorator;

import java.math.*;

public class GuidedTour extends VacationDecorator {

	BigDecimal price = new BigDecimal("400.01");

	protected GuidedTour(Vacation vacation) {
		super(vacation);
	}

	@Override
	public String getDescription() {
		return vacation.getDescription() + " Guided Tour";
	}

	@Override
	public BigDecimal getPrice() {
		return vacation.getPrice().add(this.price);
	}
}
