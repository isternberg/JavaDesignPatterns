package strategy;

public class App {

	public static void main(String[] args) {
		Flatmate smokeyButCleanJohn = new SmokyButCleanFlatmate();
		System.out.println("John the clean smoker: ");
		smokeyButCleanJohn.doSmoke();
		smokeyButCleanJohn.doClean();

		Flatmate messyNonSmokerGeorge = new NonSmokingMessyFlatmate();
		System.out.println("\nGeorge the messy nonsmoker:");
		messyNonSmokerGeorge.doSmoke();
		messyNonSmokerGeorge.doClean();

	}
}
