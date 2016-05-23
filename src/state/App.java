package state;

public class App {
    public static void main(String[] args) {
        CityToilet cityToilet = new CityToilet();
        cityToilet.insertCoin();
        cityToilet.insertCoin();
        cityToilet.setToiletState(new ToiletOutOfOrder(cityToilet));
        cityToilet.insertCoin();
    }
}
