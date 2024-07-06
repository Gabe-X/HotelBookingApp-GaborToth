import bookingmanagment.Booking;
import bookingmanagment.BookingService;
import rooms.KingRoom;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {
        List<String> bookingList = new ArrayList<>();
        Scanner scnBooking = new Scanner(System.in);
        System.out.println("Welcome to Wellness Hotel of Pajkaszeg");

        System.out.println("How many guests do want to book for?");
        String personCount = scnBooking.nextLine();
        bookingList.add(personCount);
        System.out.println("How long(number of days) are you staying for? ");
        String numberOfDays = scnBooking.nextLine();
        bookingList.add(numberOfDays);
        System.out.println("Do want to eat breakfast(Yes/No)");
        String breakfast = scnBooking.nextLine();
        bookingList.add(breakfast);
        System.out.println("What's your name?");
        String bookingPersonName = scnBooking.nextLine();
        bookingList.add(bookingPersonName);
        System.out.println("which room do you wish to pick? Standard, Superior or King.");
        String roomType = scnBooking.nextLine();
        bookingList.add(roomType);
        System.out.println("Do you need an extra bed?");
        String extraBed = scnBooking.nextLine();
        bookingList.add(extraBed);
        System.out.println("Booking details: " + bookingList);

        BookingService bookingService = new BookingService();


    }
}
