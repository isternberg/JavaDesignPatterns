package strategy;

public class SmokesInOwnRoom implements SmokingHabits {

	@Override
	public void smoke() {
		System.out.println("..smoking in own room, with window open.");

	}

}
