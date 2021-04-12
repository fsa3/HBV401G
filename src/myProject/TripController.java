package myProject;

import java.awt.image.BufferedImage;

public class TripController {
    private Booking booking;
    private Trip trip;

    public TripController(Trip trip, Booking booking) {
        this.trip = trip;
        this.booking = booking;

    }

    public Trip cancelTrip() {
        if (booking.getNmbRes() <= trip.getMinReservations()) {
            trip.cancelTrip();
            System.out.println("Trip is canceled");
        }
        return trip;
    }

    public Trip createTrip(String tripID, String destination, float date, float time, String hostEmail, int maxReservations, int minReservations, boolean isFullyBooked, String category, BufferedImage schedule, int capacity, boolean canceledTrip, int price) {
        trip = new Trip(tripID, destination, date, time, hostEmail, maxReservations, minReservations, isFullyBooked, category, schedule, capacity, canceledTrip, price);
        return trip;
    }

    // ATHUGA
    public Trip fullyBooked() {
        if (booking.getNmbRes() == trip.getMaxReservations()) {
            trip.isFullyBooked() = true;
            System.out.println("Is fully Booked");
        }
        return trip;
    }

}





