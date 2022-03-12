package controllers;

import model.BookingDetails;
import model.DateRange;
import model.User;

public class Booking {
    public BookingDetails book(){
        //TODO:Store in DB for particular user,place,hotel
        //TODO:Lock the rooms for particular hotel and room until payment is complete
        BookingDetails details = null;
        return details;
    }

    public void fetchBookingDetails(String bookingId){
        //TODO:Fetch from DB for particular booking id.
    }

    public void fetchBookingHistory(DateRange dateRange){
        //TODO:Fetch from DB for particular date range.
    }
    public void pay(String bookingId){
        //TODO:update booking status to complete after booking and also the room status to occupied.
    }

}
