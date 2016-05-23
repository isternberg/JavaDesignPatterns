package strategy;

public class Flatmate {

	public Flatmate() {

	}

	public Flatmate(SmokingHabits smokingHabits, CleaningHabits cleaningHabits) {
		this.smokingHabits = smokingHabits;
		this.cleaningHabits = cleaningHabits;
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
