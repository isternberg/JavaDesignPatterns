package factoryMethod;

public class ToyFactory extends SuperFactory {

	@Override
	public Product createProduct(ProductType type) {
		if (type == ProductType.PLASTIC_TOY) {
			return new PlasticToy();
		} else if (type == ProductType.WOODEN_TOY) {
			return new WoodenToy();
		} else {
			throw new IllegalArgumentException();
		}
	}
}
