package com.hotelreservationsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;

public class HotelReservationSystem {
    private SimpleDateFormat date = new SimpleDateFormat("ddMMMyyyy");
    private ArrayList<HotelClass> hotelClassList = new ArrayList<>();

    public HotelReservationSystem() {
        this.hotelClassList = new ArrayList<HotelClass>();
        this.addHotel(new HotelClass("Lakewood", 110,90));
        this.addHotel(new HotelClass("Bridgewood", 150,50));
        this.addHotel(new HotelClass("Ridgewood", 220,150));
    }

    public void addHotel(HotelClass hotelClass) {
        hotelClassList.add(hotelClass);
    }

    public HotelClass getCheapestHotel(String checkinDate, String checkoutDate) {
        try {
            Date checkin = date.parse(checkinDate);
            Date checkout = date.parse(checkoutDate);
            long days = (long) ((checkout.getTime() - checkin.getTime()) / (86.4e6)) +1;
            System.out.println("Days = " + days);
            return hotelClassList.stream().sorted(Comparator.comparingLong(hotelClass ->
                    (hotelClass).calculateTotalPrice(days))).findFirst().orElse(null);
        } catch (ParseException e) {
            System.out.println("Exception Occured is " + e);
        }
        return null;
    }
}
