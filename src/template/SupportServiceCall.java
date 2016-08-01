package template;

public class SupportServiceCall extends IncomingCall {

	@Override
	protected void takeCall() {
		System.out.println("Welcome to customer support. How may I help you?");
	}

	@Override
	protected void helpCustomer() {
		System.out.println("..Answering customer questions.");
	}

	@Override
	public boolean customerInterestedInSaleItems() {
		return false;
	}
}
