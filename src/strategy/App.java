package strategy;

public class App {

	public static void main(String[] args) {

		Flatmate smokeyJohn = new Flatmate("John",
				() -> "smoking everywhere", () -> "cleaning the flat regularly");
		System.out.println(smokeyJohn.toString());

		Flatmate messyGeorge = new Flatmate("Paul",
				() -> "will never smoke", () -> "cleaning whenever you remind me to" );
		System.out.println(messyGeorge.toString());

		Flatmate Ringo = new Flatmate("Ringo",
				() -> "smoking in own room", () -> "never cleaning");
		System.out.println(Ringo.toString());

	}
}
