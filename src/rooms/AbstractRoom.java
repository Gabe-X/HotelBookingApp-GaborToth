package rooms;

public abstract class AbstractRoom {
    public boolean isExtraBedNeeded;
    public int isExtraBedPrice;
    private int seasonBasedPrice;

    int getSeasonBasedDefaultPrice() {
        return 0;
    }


    abstract int calculateRoomPrice();

}
