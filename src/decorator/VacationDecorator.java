package decorator;

import java.math.*;

public class VacationDecorator implements Vacation {
	protected VacationDecorator(Vacation vacation) {
		super();
		this.vacation = vacation;
	}

	public Vacation vacation;

	@Override
	public String getDescription() {
		return vacation.getDescription();
	}

	@Override
	public BigDecimal getPrice() {
		return vacation.getPrice();
	}

}
