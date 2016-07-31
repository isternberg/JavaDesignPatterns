package abstractFactory;

public abstract class SuperFactory {

	public abstract Product createProduct(ProductType type);

	public Product supplyProduct(ProductType type, String name) {
		Product product = createProduct(type);
		product.designProduct(name);
		product.assembleProduct(name);
		product.packProduct(name);
		return product;
	}
}
