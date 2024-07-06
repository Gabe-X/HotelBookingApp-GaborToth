package bookingmanagment;

public class Booking {
    private  int roomPrice;
    private int person;
    private int days;
    private  String bookingName;
    private int breakfastPrice;

    public Booking(int roomPrice, int person, int days, String bookingName) {
        roomPrice = getRoomPrice();
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getBookingName() {
        return bookingName;
    }

    public void setBookingName(String bookingName) {
        this.bookingName = bookingName;
    }

    public int getBreakfastPrice() {
        return breakfastPrice;
    }

    public void setBreakfastPrice(int breakfastPrice) {
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
