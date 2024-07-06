package rooms;

public class StandardRoom extends AbstractRoom {
    @Override
    int calculateRoomPrice() {
        return getSeasonBasedDefaultPrice();
    }

}
