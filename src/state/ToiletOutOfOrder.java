package state;

public class ToiletOutOfOrder implements ToiletState {

    CityToilet cityToilet;

    public ToiletOutOfOrder(CityToilet cityToilet) {
        this.cityToilet = cityToilet;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, the toilet is out of order");
        System.out.println("..ejecting coin..");
    }

}
