package strategy;

public class App {

	public static void main(String[] args) {
		Flatmate smokeyButCleanJohn = new Flatmate(new SmokesEveryWhere(), new CleanRegularly());
		System.out.println("John the clean smoker: ");
		smokeyButCleanJohn.doSmoke();
		smokeyButCleanJohn.doClean();

		Flatmate messyNonSmokerGeorge = new Flatmate(new DoesntSmoke(), new CleanNowAndThan());
		System.out.println("\nGeorge the messy nonsmoker:");
		messyNonSmokerGeorge.doSmoke();
		messyNonSmokerGeorge.doClean();

		Flatmate ringo = new Flatmate(new SmokesInOwnRoom(), new CleanNowAndThan());
		System.out.println("\nRingo	 the quiet flatmate:");
		ringo.doSmoke();
		ringo.doClean();
	}
}
