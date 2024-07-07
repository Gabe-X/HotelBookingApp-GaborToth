package bookingmanagment;

public class Booking {
    private final int roomPrice;
    private final int person;
    private final int days;
    private final String bookingName;
    private final boolean breakfastPrice;

    public Booking(int roomPrice, int person, int days, String bookingName, boolean breakfastPrice) {
        this.roomPrice = roomPrice;
        this.person = person;
        this.days = days;
        this.bookingName = bookingName;
        this.breakfastPrice = breakfastPrice;
    }

    public int getTotalCost() {
        int totalCost = 0;
       /* if (person % 2 == 0){
            totalCost += roomPrice;
        } else if (person % 2 == 1)
            totalCost += roomPrice + roomPrice;*/
        totalCost = roomPrice * person * days;
        if (breakfastPrice)
            totalCost += 4500 * days * person;
        return totalCost;
    }

    /*
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
    */
    @Override
    public String toString() {
        return "Booking details{" +
                "roomPrice=" + roomPrice +
                ", number of guests=" + person +
                ", days to stay=" + days +
                ", bookingName='" + bookingName + '\'' +
                ", asked for breakfast=" + breakfastPrice +
                '}';
    }

}
