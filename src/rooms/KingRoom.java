package rooms;

public class KingRoom extends AbstractRoom {
    private int additionalRoomPrice = 11000;

    @Override
    int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice() + additionalRoomPrice;
    }

}

