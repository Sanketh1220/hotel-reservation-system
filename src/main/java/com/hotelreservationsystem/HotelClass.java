package com.hotelreservationsystem;

public class HotelClass {
    private String hotelName;
    private int regularCustRate;
    private long totalRates;

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

    public long calculateTotalPrice(long days) {
        this.totalRates = days * regularCustRate;
        return totalRates;
    }

    public String toString() {
        return hotelName + ",Total price is $" + totalRates;
    }
}
