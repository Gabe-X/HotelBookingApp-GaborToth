import bookingmanagment.Booking;
import rooms.KingRoom;
import rooms.StandardRoom;
import rooms.SuperiorRoom;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelBookingApp {
    public static void main(String[] args) {
        ArrayList<String> bookingList = new ArrayList<>();
        Scanner scnBooking = new Scanner(System.in);
        String stringToList = "";
        System.out.println("Welcome to Wellness Hotel of Pajkaszeg!");

        System.out.println("How many guests do want to book for?");
        String personCount = scnBooking.nextLine();

        System.out.println("How long(number of days) are you staying for? ");
        String numberOfDays = scnBooking.nextLine();

        System.out.println("Do want to eat breakfast(Yes/No)");
        String breakfast = scnBooking.nextLine();

        System.out.println("What's your name?");
        String bookingPersonName = scnBooking.nextLine();

        System.out.println("which room do you wish to pick? Standard, Superior or King.");
        String roomType = scnBooking.nextLine();

        System.out.println("Do you need an extra bed?");
        String extraBed = scnBooking.nextLine();
        stringToList = personCount + ", " + numberOfDays + ", " + breakfast + ", " + bookingPersonName + ", " + roomType + ", " + extraBed;
        bookingList.add(stringToList);
        System.out.println("Booking details: " + bookingList);
            //  9.a
        //  BookingService bookingService = new BookingService();
        //  bookingService.newBooking(bookingList);
        KingRoom kingRoom = new KingRoom();
        StandardRoom standardRoom = new StandardRoom();
        SuperiorRoom superiorRoom = new SuperiorRoom();
            //  9.b
        int bookingRoomPrice = 0;
        switch (roomType) {
            case "Standard":
                bookingRoomPrice = standardRoom.calculateRoomPrice();
                break;
            case "Superior":
                bookingRoomPrice = superiorRoom.calculateRoomPrice();
                break;
            case "King":
                bookingRoomPrice = kingRoom.calculateRoomPrice();
                break;
            default:
                System.out.println("Please recheck your room options");
                System.err.println("Typing error at room options");


        }
        System.out.println(bookingRoomPrice);
            //  9.c
        for (String booking : bookingList) {
            // "2","6","yes","name","King","yes"
            String[] bookingArrayParameter = booking.split(", ");
            int personNumberArray = Integer.parseInt(bookingArrayParameter[0]);
            int daysArray = Integer.parseInt(bookingArrayParameter[1]);
            boolean breakfastArray = Boolean.parseBoolean(bookingArrayParameter[2]);
            String personBookingArray = bookingArrayParameter[3];
            String roomTypeArray = bookingArrayParameter[4];
            boolean extraBedArray = Boolean.parseBoolean(bookingArrayParameter[5]);

            Booking bookingOne = new Booking(bookingRoomPrice, personNumberArray, daysArray, personBookingArray, breakfastArray);
            // 9.d
            int bookingCost = bookingOne.getTotalCost();
            System.out.println("Total booking cost: " + bookingCost);
            System.out.println(bookingOne);
        }
    }
}
