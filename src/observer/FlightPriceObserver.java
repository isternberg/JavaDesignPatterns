package observer;

public class FlightPriceObserver implements  Observer {
    private double economyPrice;
    private double businessPrice;
    private double firstClassPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject flightPricePublisher;

    public FlightPriceObserver(Subject flightPricePublisher){
        this.flightPricePublisher = flightPricePublisher;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        flightPricePublisher.register(this);
    }

    public void update(double economyPrice, double businessPrice, double firstClassPrice) {
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.firstClassPrice = firstClassPrice;
        printPrices();
    }

    public void printPrices(){
        System.out.println(observerID + ": Eceonmy: " + economyPrice + "\tBusiness: " +
                businessPrice + " \tFirstClass: " + firstClassPrice );
    }
}
