package com.hotelreservationsystem;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner inputScan = new Scanner(System.in);
        System.out.println("Welcome to Hotel Reservation System!");

        HotelReservationSystem hotelSystem = new HotelReservationSystem();
//        hotelSystem.addHotel(new HotelClass("Lakewood", 110));
//        hotelSystem.addHotel(new HotelClass("Bridgewood", 160));
//        hotelSystem.addHotel(new HotelClass("Ridgewood", 220));
        System.out.println("Hotels are added!");

        boolean repeat = true;
        while (repeat) {
            System.out.println("Select Options: \n1.Get cheapest hotel price\n2.Exit");
            int option = Integer.parseInt(inputScan.nextLine());

            switch (option) {
                case 1:
                    getCheapestHotelForDateRange(inputScan, hotelSystem);
                    break;
                case 2:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }

    public static void getCheapestHotelForDateRange(Scanner inputScan, HotelReservationSystem hotelSystem) {
        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkinDate = inputScan.nextLine();

        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkoutDate = inputScan.nextLine();

        System.out.println("From " + checkinDate + " to " + checkoutDate);

        HotelClass cheapestHotel = hotelSystem.getBestRatedHotel(checkinDate, checkoutDate);
        System.out.println("Cheapest hotel for the date range is: " + cheapestHotel);
    }
}
