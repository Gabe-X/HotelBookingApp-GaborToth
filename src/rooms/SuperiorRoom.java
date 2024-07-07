package rooms;

public class SuperiorRoom extends AbstractRoom {
    private int additionalRoomPrice = 3500;

    public SuperiorRoom() {
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
