package decorator;

import java.math.*;

public class Hotel extends VacationDecorator {

	private BigDecimal price;
	private String description;


	protected Hotel(Vacation vacation) {
		super(vacation);
		price = new BigDecimal("700.98");
		description = " Hotel";
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
