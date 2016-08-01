package template;

public class OrderServiceCall extends IncomingCall {

	@Override
	protected void takeCall() {
		System.out.println("Hello, may I take your order?");

	}

	@Override
	protected void helpCustomer() {
		System.out.println("..taking customer's order.");
	}

	protected void giveSpecialOffer() {
		System.out.println("..Telling customer about sale items.");
	}

}
