package bookingmanagment;

public class Booking {
    BookingService bookingOne = new BookingService();
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

    public int getTotalCost() {
        int totalCost = roomPrice * person * days;
        if (breakfastPrice)
            totalCost += 4500 * days * person;
        return totalCost;
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

    public boolean isBreakfastPrice() {
        return breakfastPrice;
    }

    public void setBreakfastPrice(boolean breakfastPrice) {
        this.breakfastPrice = breakfastPrice;
    }

    public BookingService getBookingOne() {
        return bookingOne;
    }

    public void setBookingOne(BookingService bookingOne) {
        this.bookingOne = bookingOne;
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
