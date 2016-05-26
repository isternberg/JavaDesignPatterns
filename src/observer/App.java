package observer;

public class App {
    public static void main(String[] args) {

        FlightPricePublisher flightPricePublisher = new FlightPricePublisher();

        // Create an Observer that will be sent updates from Subject
        FlightPriceObserver observer1 = new FlightPriceObserver(flightPricePublisher);

        flightPricePublisher.setEconomyPrice(400);
        flightPricePublisher.setBusinessPrice(800);
        flightPricePublisher.setFirstClassPrice(1200);

        FlightPriceObserver observer2 = new FlightPriceObserver(flightPricePublisher);

        flightPricePublisher.setEconomyPrice(300);
        flightPricePublisher.setBusinessPrice(600);
        flightPricePublisher.setFirstClassPrice(900);

        flightPricePublisher.unregister(observer2);

        flightPricePublisher.setEconomyPrice(425);
        flightPricePublisher.setBusinessPrice(690);
        flightPricePublisher.setFirstClassPrice(1420);

    }

    }
