package com.hotelreservationsystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HotelReservationSystemTest {
    @Test
    public void GivenInput_ForGetCheapestHotel_ForDateRange() {
        HotelReservationSystem obj  = new HotelReservationSystem();
        assertEquals("Lakewood, Total Rates: $220", obj.getCheapestHotel("10Sep2020", "11Sep2020").toString());
    }
}
