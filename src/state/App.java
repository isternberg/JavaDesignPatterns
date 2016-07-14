package state;

public class App {
    public static void main(String[] args) {
        CityToilet cityToilet = new CityToilet();
        System.out.println("[inserting coin]");
        cityToilet.insertCoin();
        System.out.println("[inserting coin]");
        cityToilet.insertCoin();
        System.out.println("[inserting coin]");
        cityToilet.insertCoin();
    }
}
