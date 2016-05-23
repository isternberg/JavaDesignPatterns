package state;

public class CityToilet {
    ToiletState toiletState;

    ToiletState toiletFree;
    ToiletState toiletOccupied;
    ToiletState toiletOutOfOder;

    public CityToilet() {
        toiletFree = new ToiletFree(this);
        toiletOccupied = new ToiletOccupied(this);
        toiletOutOfOder = new ToiletOutOfOrder(this);

        toiletState = toiletFree;
        System.out.println("Please insert a 1 Euro Coin.");

    }

    public void setToiletState(ToiletState newToiletState) {
        this.toiletState = newToiletState;
    }

    public void insertCoin(){
        toiletState.insertCoin();
    }


    public ToiletState getToiletFree(){return toiletFree;}
    public ToiletState getToiletOccupied(){return toiletOccupied;}
    public ToiletState getToiletOutOfOder(){return toiletOutOfOder;}

}
