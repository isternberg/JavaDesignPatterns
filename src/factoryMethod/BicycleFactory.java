package factoryMethod;

public class BicycleFactory extends SuperFactory {

	@Override
	public Product createProduct(ProductType type) {
		if (type == ProductType.SPORT_BICYCLE) {
			return new SportBicycle();
		} else if (type == ProductType.CITY_BICYCLE) {
			return new CityBicycle();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
