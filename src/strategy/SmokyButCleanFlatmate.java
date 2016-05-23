package strategy;

public class SmokyButCleanFlatmate extends Flatmate {

	public SmokyButCleanFlatmate() {
		smokingHabits = new SmokesEveryWhere();
		cleaningHabits = new CleanRegularly();
	}

}
