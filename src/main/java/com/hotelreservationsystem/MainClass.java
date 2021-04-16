package com.hotelreservationsystem;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainClass {

    static SimpleDateFormat date = new SimpleDateFormat("ddMMMyyyy");

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
            System.out.println("Select Options: \n1. Get cheapest hotel price for date range\n2. Get cheapest best rated hotel for date range\n" +
                    "3. Get best rated hotel for date range\n4.Exit");
            int option = Integer.parseInt(inputScan.nextLine());

            //switch case for choosing which to get
            switch (option) {
                case 1:
                    getCheapestHotelForDateRange(inputScan, hotelSystem);
                    break;
                case 2:
                    getCheapestBestHotelForDateRange(inputScan, hotelSystem);
                    break;
                case 3:
                    getBestRatedHotelForDateRange(inputScan, hotelSystem);
                    break;
                case 4:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }

    //taking inputs from user to get respective methods
    public static void getCheapestHotelForDateRange(Scanner inputScan, HotelReservationSystem hotelSystem) {
        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkinDate = inputScan.nextLine();

        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkoutDate = inputScan.nextLine();

        System.out.println("Enter the type of customer you are (reward or regular)");
        String type = inputScan.nextLine();

        System.out.println("From " + checkinDate + " to " + checkoutDate + " and type of customer is " + type);

        HotelClass cheapestHotel = hotelSystem.getCheapestHotel(checkinDate, checkoutDate, type);
        System.out.println("Cheapest hotel for the date range is: " + cheapestHotel);
    }

    public static void getCheapestBestHotelForDateRange(Scanner inputScan, HotelReservationSystem hotelSystem) {
        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkinDate = inputScan.nextLine();

        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkoutDate = inputScan.nextLine();

        System.out.println("Enter the type of customer you are (reward or regular)");
        String type = inputScan.nextLine();

        System.out.println("From " + checkinDate + " to " + checkoutDate + " and type of customer is " + type);

        HotelClass cheapestHotel = hotelSystem.getCheapestBestHotel(checkinDate, checkoutDate, type);
        System.out.println("Cheapest hotel for the date range is: " + cheapestHotel);
    }

    public static void getBestRatedHotelForDateRange(Scanner inputScan, HotelReservationSystem hotelSystem) {
        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkinDate = inputScan.nextLine();

        System.out.println("Enter the Checkin Date (Format : ddMMMyyyy) (Ex: 13Nov2020)");
        String checkoutDate = inputScan.nextLine();

        System.out.println("Enter the type of customer you are (reward or regular)");
        String type = inputScan.nextLine();

        System.out.println("From " + checkinDate + " to " + checkoutDate + " and type of customer is " + type);

        HotelClass cheapestHotel = hotelSystem.getBestRatedHotel(checkinDate, checkoutDate, type);
        System.out.println("Cheapest hotel for the date range is: " + cheapestHotel);
    }

    public static String getDateInput(Scanner inputScan) {
        String dateString;
        while (true) {
            dateString = inputScan.nextLine();
            try {
                date.parse(dateString);
                break;
            } catch (Exception e) {
                System.out.println("Enter a valid date (ddMMMyyyy): " + e);
            }
        }
        return dateString;
    }

    public static String getCustomerTypeInput(Scanner inputScan) {
        String type;
        while (true) {
            type = inputScan.nextLine();
            if (validateCustomer(type))
                break;
            System.out.println("Enter valid customer type");
        }
        return type;
    }

    public static boolean validateCustomer(String type) {
        return type.equalsIgnoreCase("reward") || type.equalsIgnoreCase("regular");
    }
}