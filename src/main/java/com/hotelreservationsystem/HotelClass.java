package com.hotelreservationsystem;

public class HotelClass {
    private String hotelName;
    private int regularCustRate;

    public HotelClass(String hotelName, int regularCustRate) {
        this.hotelName = hotelName;
        this.regularCustRate = regularCustRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public int getRegularCustRate(){
        return regularCustRate;
    }
}
