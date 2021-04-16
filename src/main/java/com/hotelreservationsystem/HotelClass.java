package com.hotelreservationsystem;

public class HotelClass {
    private String hotelName;
    private int regularCustRate;
    private int regularWeekdayRate;
    private int regularWeekendRate;
    private long totalRates;
    private int ratingForHotel;
    private int rewardWeekdayRate;
    private int rewardWeekendRate;

    public HotelClass(String hotelName, int regularWeekdayRate, int regularWeekendRate, int rewardWeekdayRate,
                      int rewardWeekendRate, int ratingForHotel) {
        this.hotelName = hotelName;
        this.regularWeekdayRate = regularWeekdayRate;
        this.regularWeekendRate = regularWeekendRate;
        this.rewardWeekdayRate = regularWeekdayRate;
        this.rewardWeekendRate = regularWeekendRate;
        this.ratingForHotel = ratingForHotel;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getRegularWeekdayRate(){
        return regularWeekdayRate;
    }

    public void setRegularWeekdayRate(int regularWeekdayRate) {
        this.regularWeekdayRate = regularWeekdayRate;
    }

    public int getRegularWeekendRate() {
        return regularWeekendRate;
    }

    public void setRegularWeekendRate(int regularWeekendRate) {
        this.regularWeekendRate = regularWeekendRate;
    }
    public int getRatingForHotel() {
        return ratingForHotel;
    }

    public void setRatingForHotel(int ratingForHotel) {
        this.ratingForHotel = ratingForHotel;
    }

    public long calculateTotalPrice(long weekDays, long weekEndDays) {
        this.totalRates = weekDays * regularWeekdayRate + weekEndDays * regularWeekendRate;
        return totalRates;
    }

    public String toString() {
        return hotelName + " rated : " + ratingForHotel  + ", Total price is $" + totalRates;
    }
}
