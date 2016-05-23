package strategy;

public abstract class Flatmate {

	public Flatmate() {

	}

	SmokingHabits smokingHabits;
	CleaningHabits cleaningHabits;

	public void doSmoke() {
		smokingHabits.smoke();
	}

	public void doClean() {
		cleaningHabits.clean();
	}
}
