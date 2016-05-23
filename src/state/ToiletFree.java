package state;

public class ToiletFree implements ToiletState {

    CityToilet cityToilet;

    public ToiletFree(CityToilet cityToilet) {
        this.cityToilet = cityToilet;
    }

    @Override
    public void insertCoin() {
        System.out.println("..Opening door..closing door behind you");
        cityToilet.setToiletState(cityToilet.getToiletOccupied());
    }

}
