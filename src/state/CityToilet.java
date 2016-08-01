package state;

public class CityToilet {
    ToiletState toiletState;

    ToiletState toiletFree;
    ToiletState toiletOccupied;
    ToiletState toiletOutOfOder;

    int usageCounter = 0;

    public CityToilet() {
        toiletFree = new ToiletFree(this);
        toiletOccupied = new ToiletOccupied(this);
        toiletOutOfOder = new ToiletOutOfOrder(this);

        toiletState = toiletFree;
        System.out.println("Please insert a 1 Euro Coin.");

    }

    protected void setToiletState(ToiletState newToiletState) {
        this.toiletState = newToiletState;
    }

    public void insertCoin(){
        // simulating a Planned obsolescence "feature"
        usageCounter++;
        if (usageCounter > 2){
            toiletState = toiletOutOfOder;
        }

        toiletState.insertCoin();
    }


    public ToiletState getToiletFree(){return toiletFree;}
    public ToiletState getToiletOccupied(){return toiletOccupied;}
    public ToiletState getToiletOutOfOder(){return toiletOutOfOder;}

}
