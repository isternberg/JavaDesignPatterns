package abstractFactory;

public abstract class Product {

	protected String name;

	protected void designProduct(String name) {
		System.out.println("Designing " + name);
	}

	protected void assembleProduct(String name) {
		System.out.println("Assembling " + name);
	}

	protected void packProduct(String name) {
		System.out.println("Packing " + name);
	}
}
