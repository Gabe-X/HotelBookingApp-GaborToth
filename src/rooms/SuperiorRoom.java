package rooms;

public class SuperiorRoom extends AbstractRoom{
    private  int additionalRoomPrice = 3500;
    @Override
    int calculateRoomPrice() {
        return 0;
    }
    int additionalRoomPrice() {

        return getSeasonBasedDefaultPrice() +additionalRoomPrice;
    }
}
