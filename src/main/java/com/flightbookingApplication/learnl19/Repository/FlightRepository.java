package com.flightbookingApplication.learnl19.Repository;

import com.flightbookingApplication.learnl19.Database.FlightList;

import com.flightbookingApplication.learnl19.Entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FlightRepository {
    @Autowired
    FlightList flightList;
    public List<Flight>getAllList(){
        return flightList.getAllFlights();
    }
}
