package com.gridnine.testing;

import com.gridnine.testing.builder.FlightBuilder;

public class Main {
    public static void main(String[] args) {
        //All flights
        System.out.println("All flights:\n" + FlightBuilder.createFlights());

        //Flights except departure earlier than the current time
        System.out.println("Flights except departure earlier than the current time:\n"
                + FlightBuilder.displayFlightsDepartingAfterTheCurrentTime());

        //Flights except segments with an arrival date earlier than the departure date
        System.out.println("Flights except segments with an arrival date earlier than the departure date:\n"
                + FlightBuilder.displayFlightsWhereSegmentsWithArrivalLaterThanDeparture());

        //Flights except flights, where the total time spent on the ground exceeds two hours
        System.out.println("Flights except flights, where the total time spent on the ground exceeds two hours:\n"
                + FlightBuilder.displayFlightsWithAStayOnTheGroundOfLessThanTwoHours());

    }
}