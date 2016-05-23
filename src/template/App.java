package template;

public class App {
	public static void main(String[] args) {
		IncomingCall customerSupportCall = new SupportServiceCall();
		customerSupportCall.serveCustomer();

		IncomingCall orderServiceCall = new OrderServiceCall();
		orderServiceCall.serveCustomer();

	}
}
