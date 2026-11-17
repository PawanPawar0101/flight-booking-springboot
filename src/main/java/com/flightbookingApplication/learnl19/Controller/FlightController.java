package com.flightbookingApplication.learnl19.Controller;

import com.flightbookingApplication.learnl19.Entity.Flight;
import com.flightbookingApplication.learnl19.Service.FlightService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class FlightController {

    @Autowired
    FlightService flightService;

    // Open search page
    @GetMapping("/")
    public String home() {
        return "search";
    }

    // Process flight search
    @PostMapping("/searchFlights")
    public String getSearchFlightResult(
            @RequestParam("source") String source,
            @RequestParam("destination") String destination,
            Model model) {

        List<Flight> listOfSearchFlight =
                flightService.getAllFlightsFromSourceToDestination(
                        source, destination);

        model.addAttribute("listofsearchFlights", listOfSearchFlight);

        return "success";
    }
}