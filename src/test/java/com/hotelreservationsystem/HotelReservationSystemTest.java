package com.hotelreservationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelReservationSystemTest {
    @Test
    public void testGetCheapestHotelForDateRange() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Lakewood, Rating: 3 and Total Rates: $220",
                obj.getCheapestHotel("10Sep2020", "11Sep2020", "Regular").toString());
    }

    @Test
    public void testGetCheapestHotelForDateRangeWithWeekends() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Lakewood, Rating: 3 and Total Rates: $200",
                obj.getCheapestHotel("11Sep2020", "12Sep2020", "Regular").toString());
    }

    @Test
    public void testGetCheapestHotelForDateRangeWithWeekendsWithBestRating() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Bridgewood, Rating: 4 and Total Rates: $200",
                obj.getCheapestBestHotel("11Sep2020", "12Sep2020", "Regular").toString());
    }

    @Test
    public void testGetBestRatedHotelForDateRangeWithWeekends() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Ridgewood, Rating: 5 and Total Rates: $370",
                obj.getBestRatedHotel("11Sep2020", "12Sep2020", "Regular").toString());
    }

    @Test
    public void testGetCheapestHotelForDateRangeWithWeekendsWithBestRatingRewardCustomer() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Ridgewood, Rating: 5 and Total Rates: $140",
                obj.getCheapestBestHotel("10Sep2020", "11Sep2020", "Reward").toString());
    }

    @Test
    public void testGetCheapestHotelForDateRangeWithWeekendsWithBestRatingRegularCustomer() {
        HotelReservationSystem obj = new HotelReservationSystem();
        assertEquals("Bridgewood, Rating: 4 and Total Rates: $200",
                obj.getCheapestBestHotel("11Sep2020", "12Sep2020", "Regular").toString());
    }
}
