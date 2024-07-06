package bookingmanagment;

public class Booking {
    private int roomPrice;
    private int person;
    private int days;
    private String bookingName;
    private boolean breakfastPrice;

    public Booking(int roomPrice, int person, int days, String bookingName, boolean breakfastPrice) {
        this.roomPrice = roomPrice;
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
        this.breakfastPrice = breakfastPrice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "roomPrice=" + roomPrice +
                ", person=" + person +
                ", days=" + days +
                ", bookingName='" + bookingName + '\'' +
                ", breakfastPrice=" + breakfastPrice +
                '}';
    }
}
