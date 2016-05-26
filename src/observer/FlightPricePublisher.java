package observer;

import java.util.ArrayList;
import java.util.List;

public class FlightPricePublisher implements  Subject {

    private List<Observer> observers;
    private double economyPrice;
    private double businessPrice;
    private double firstClassPrice;

    public FlightPricePublisher(){
        observers = new ArrayList<>();
    }

    /**
     * Adds a new observer
     */
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    /**
     * Removes an observer
     */
    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);

    }

    /**
     * Notifies all observers about price changes
     */
    @Override
    public void notifyObserver() {
        observers.forEach(x -> x.update(economyPrice, businessPrice, firstClassPrice));
    }

    public void setEconomyPrice(double newEconomyPrice){
        this.economyPrice = newEconomyPrice;
        notifyObserver();
    }

    public void setBusinessPrice(double newBusinessPrice){
        this.businessPrice = newBusinessPrice;
        notifyObserver();
    }

    public void setFirstClassPrice(double newFirstClassPrice){
        this.firstClassPrice = newFirstClassPrice;
        notifyObserver();
    }
}
