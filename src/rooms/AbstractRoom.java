package rooms;

import java.time.LocalDate;

public abstract class AbstractRoom {
    boolean isExtraBedNeeded;
    int ExtraBedPrice;
    private int seasonBasedPrice;

    int getSeasonBasedDefaultPrice() {
        return 0;
    }



    abstract int calculateRoomPrice();

    @Override
    public String toString() {
        return "AbstractRoom{" +
                "isExtraBedNeeded=" + isExtraBedNeeded +
                ", isExtraBedPrice=" + ExtraBedPrice +
                ", seasonBasedPrice=" + seasonBasedPrice +
                '}';
    }
}
