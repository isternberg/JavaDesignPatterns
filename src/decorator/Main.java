package decorator;

public class Main {
	public static void main(String[] args) {
		Vacation v1 = new BasicVacation();
		System.out.println("Booked: " + v1.getDescription());
		System.out.println("Price: " + v1.getPrice());
		System.out.println();
		Vacation v2 = new Hotel(new GuidedTour(new BasicVacation()));
		System.out.println("Booked: " + v2.getDescription());
		System.out.println("Price: " + v2.getPrice());
		System.out.println();


	}

}
