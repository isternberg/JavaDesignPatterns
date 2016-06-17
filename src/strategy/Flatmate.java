package strategy;

public class Flatmate {

	public Flatmate() {

	}

	public Flatmate(String name, SmokingHabits smokingHabits, CleaningHabits cleaningHabits) {
        this.name = name;
		this.smokingHabits = smokingHabits;
		this.cleaningHabits = cleaningHabits;
	}

	String name;
	SmokingHabits smokingHabits;
	CleaningHabits cleaningHabits;

	public void doSmoke() {
		smokingHabits.smoke();
	}

	public void doClean() {
		cleaningHabits.clean();
	}

	@Override
	public String toString() {
		return "Flatmate " +
				 name  +
				",\t\tsmokingHabits: " + smokingHabits.smoke() +
				",\t\tcleaningHabits: " + cleaningHabits.clean();
	}
}
