package com.hotelreservationsystem;

import java.util.ArrayList;

public class HotelReservationSystem {
    private ArrayList<HotelClass> hotelClassList = new ArrayList<>();

    public HotelReservationSystem() {
        this.hotelClassList = new ArrayList<HotelClass>();
    }

    public void addHotel(HotelClass hotelClass) {
        hotelClassList.add(hotelClass);
    }
}
