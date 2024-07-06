package rooms;

public class StandardRoom extends AbstractRoom {
    @Override
   protected int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice();
    }
    public StandardRoom() {
    }
}
