package bookingmanagment;

import rooms.KingRoom;
import rooms.StandardRoom;
import rooms.SuperiorRoom;

import java.util.ArrayList;
import java.util.List;

public class BookingService implements BookingInterface {

    public BookingService() {
        KingRoom kingRoom = new KingRoom();
        StandardRoom standardRoom = new StandardRoom();
        SuperiorRoom superiorRoom = new SuperiorRoom();
    }

    @Override
    public void newBooking(ArrayList<String> newBooking) {
        List<Booking> bookingParameters = new ArrayList<>();

    }

}
