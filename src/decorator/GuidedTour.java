package decorator;

import java.math.*;

public class GuidedTour extends VacationDecorator {

	private BigDecimal price;
	private String description;

	protected GuidedTour(Vacation vacation) {
		super(vacation);
		price = new BigDecimal("400.01");
		description = " Guided-Tour";
	}

	@Override
	public String getDescription() {
		return vacation.getDescription() + this.description;
	}

	@Override
	public BigDecimal getPrice() {
		return vacation.getPrice().add(this.price);
	}
}
