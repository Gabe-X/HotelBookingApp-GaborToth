package rooms;

public class SuperiorRoom extends AbstractRoom{
    @Override
    int calculateRoomPrice() {
        return 0;
    }
    int additionalRoomPrice() {
        //TODO A superior szoba felára: 3.500 Ft
        return 0;
    }
}
