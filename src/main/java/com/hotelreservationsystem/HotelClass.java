package com.hotelreservationsystem;

public class HotelClass {
    private String hotelName;
    private int regularCustRate;
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private long totalRates;

    public HotelClass(String hotelName, int regularCustRate) {
        this.hotelName = hotelName;
        this.regularCustRate = regularCustRate;
//        this.regularWeekdayRate = regularWeekdayRate;
//        this.regularWeekendRate = regularWeekendRate;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName() {
        this.hotelName =hotelName;
    }

    public int getRegularWeekdayRate(){
        return regularWeekdayRate;
    }

    public void setRegularWeekdayRate() {
        this.regularWeekdayRate = regularWeekdayRate;
    }

    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    public void setRegularWeekendRate() {
        this.regularWeekendRate = regularWeekendRate;
    }

    public long calculateTotalPrice(long days) {
        this.totalRates = regularCustRate * days;
//                + weekEndDays * regularWeekendRate;
        return totalRates;
    }

    public String toString() {
        return hotelName + ", Total Rates: $" + totalRates;
    }
}
