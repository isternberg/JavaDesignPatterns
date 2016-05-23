package strategy;

public class NonSmokingMessyFlatmate extends Flatmate {

	public NonSmokingMessyFlatmate() {
		smokingHabits = new DoesntSmoke();
		cleaningHabits = new CleanNowAndThan();
	}
}
