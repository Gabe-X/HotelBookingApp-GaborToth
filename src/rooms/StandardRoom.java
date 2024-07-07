package rooms;

public class StandardRoom extends AbstractRoom {
    public StandardRoom() {
    }

    @Override
    public int calculateRoomPrice() {
        int roomPrice = 0;
        if (isExtraBedNeeded)
            roomPrice = ExtraBedPrice;
        roomPrice += getSeasonBasedDefaultPrice();
        return roomPrice;
    }
}
