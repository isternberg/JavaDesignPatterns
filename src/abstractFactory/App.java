package abstractFactory;

public class App {
	public static void main(String[] args) {
		SuperFactory toyFactory = new ToyFactory();
		Product toyProduct = toyFactory.supplyProduct(ProductType.PLASTIC_TOY,
				"plastic toy");


		SuperFactory bicycleFactory = new BicycleFactory();
		Product cityBicycle = bicycleFactory.supplyProduct(
				ProductType.CITY_BICYCLE, "city bicycle");
	}

}
