package rooms;

public class SuperiorRoom extends AbstractRoom {
    private int additionalRoomPrice = 3500;

    @Override
    protected int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice() + additionalRoomPrice;
    }

    public SuperiorRoom() {
    }
}
