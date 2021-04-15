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

    public int getWeekDays(Date startDate, Date endDate) {
        Calendar startCal = Calendar.getInstance();
        startCal.setTime(endDate);

        Calendar endCal = Calendar.getInstance();
        endCal.setTime(endDate);

        int workDays = 0;
        if(startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK )!= Calendar.SUNDAY) {
            ++workDays;
        }
        if (startCal.getTimeInMillis() > endCal.getTimeInMillis()) {
            startCal.setTime(endDate);
            endCal.setTime(startDate);
        }
        do {
            startCal.add(Calendar.DAY_OF_MONTH, 1);
            if(startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY && startCal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY) {
                ++workDays;
            }
        }while(startCal.getTimeInMillis() <= endCal.getTimeInMillis());
        return workDays;
    }

    public HotelClass getCheapestHotel(String checkinDate, String checkoutDate) {
        try {
            Date checkin = date.parse(checkinDate);
            Date checkout = date.parse(checkoutDate);
            long days = (long) ((checkout.getTime() - checkin.getTime()) / (86.4e6)) +1;
            long weekDays = getWeekDays(checkin, checkout);
            long weekEndDays = days - weekDays;
            System.out.println("Days = " + days);
            System.out.println("Week Days = " + weekDays);
            System.out.println("Week End Days = " + weekEndDays);
            return hotelClassList.stream().sorted(Comparator.comparingLong(hotelClass ->
                    (hotelClass).calculateTotalPrice(weekDays, weekEndDays))).findAny().orElse(null);
        } catch (ParseException e) {
            System.out.println("Exception Occured is " + e);
        }
        return null;
    }
}
