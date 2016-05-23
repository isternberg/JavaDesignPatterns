package strategy;

public class SmokesInOwnRoom implements SmokingHabits {

	@Override
	public void smoke() {
		System.out.print("..smoking in own room, with window open.");

	}

}
