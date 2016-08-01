package template;

public abstract class IncomingCall {

	// template method
	final void serveCustomer() {
		takeCall();
		helpCustomer();
		if (customerInterestedInSaleItems()) {
			giveSpecialOffer();
		}
		finishCall();
	}

	protected abstract void takeCall();

	protected abstract void helpCustomer();

	protected void giveSpecialOffer() {};

	public boolean customerInterestedInSaleItems() {
		return true;
	}

	public void finishCall() {
		System.out.println("Thank you for your call. Have a nice day!\n");
	};

}
