package rooms;

public class KingRoom extends AbstractRoom {
    private int additionalRoomPrice = 11000;

    public KingRoom() {
    }

    @Override
    public int calculateRoomPrice() {
        int roomPrice = 0;
        if (isExtraBedNeeded)
            roomPrice = ExtraBedPrice;
        roomPrice += getSeasonBasedDefaultPrice() + additionalRoomPrice;
        return roomPrice;
    }
}

