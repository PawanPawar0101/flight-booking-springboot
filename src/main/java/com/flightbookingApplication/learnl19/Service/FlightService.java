package com.flightbookingApplication.learnl19.Service;

import com.flightbookingApplication.learnl19.Entity.Flight;
import com.flightbookingApplication.learnl19.Repository.FlightRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> getAllFlightsFromSourceToDestination(
            String flightSource, String flightDestination) {

        return flightRepository.getAllList()
                .stream()
                .filter(flight -> flight.getFlightSource().equalsIgnoreCase(flightSource)
                && flight.getFlightDestinatio().equalsIgnoreCase(flightDestination)).toList();
    }
}