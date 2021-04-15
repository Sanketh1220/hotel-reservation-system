package com.hotelreservationsystem;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation System!");

        HotelReservationSystem hotelSystem = new HotelReservationSystem();
        hotelSystem.addHotel(new HotelClass("Lakewood", 110));
        hotelSystem.addHotel(new HotelClass("Lakewood", 160));
        hotelSystem.addHotel(new HotelClass("Lakewood", 220));
        System.out.println("Hotels are added!");
    }
}
