package strategy;

public class DoesntSmoke implements SmokingHabits {

	@Override
	public void smoke() {
		System.out.print("..not smoking.");
	}

}
