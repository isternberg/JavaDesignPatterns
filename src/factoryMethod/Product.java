package factoryMethod;

public abstract class Product {

	protected String name;

	protected void designProduct(String name) {
		System.out.println("Designing " + name);
	}

	protected void assambleProduct(String name) {
		System.out.println("Assembling " + name);
	}

	protected void packProduct(String name) {
		System.out.println("Packing " + name);
	}
}
