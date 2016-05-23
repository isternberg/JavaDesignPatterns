package state;

public class ToiletOccupied implements ToiletState {

    CityToilet cityToilet;

    public ToiletOccupied(CityToilet cityToilet) {
        this.cityToilet = cityToilet;
    }

    @Override
    public void insertCoin() {
        System.out.println("Sorry, the toilet is occupied. Please wait.");
        System.out.println("..ejecting coin..");
    }


}
