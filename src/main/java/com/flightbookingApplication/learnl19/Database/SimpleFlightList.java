package com.flightbookingApplication.learnl19.Database;

import com.flightbookingApplication.learnl19.Entity.Flight;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SimpleFlightList implements FlightList {
    List<Flight> listOfFlights = new ArrayList<>();

    public SimpleFlightList() {

        // Mumbai to Pune
        listOfFlights.add(new Flight("Fl001", "Mumbai", "Pune"));
        listOfFlights.add(new Flight("Fl002", "Mumbai", "Pune"));
        listOfFlights.add(new Flight("Fl003", "Mumbai", "Pune"));
        listOfFlights.add(new Flight("Fl004", "Mumbai", "Pune"));
        listOfFlights.add(new Flight("Fl005", "Mumbai", "Pune"));

        // Mumbai to Delhi
        listOfFlights.add(new Flight("Fl006", "Mumbai", "Delhi"));
        listOfFlights.add(new Flight("Fl007", "Mumbai", "Delhi"));
        listOfFlights.add(new Flight("Fl008", "Mumbai", "Delhi"));
        listOfFlights.add(new Flight("Fl009", "Mumbai", "Delhi"));
        listOfFlights.add(new Flight("Fl010", "Mumbai", "Delhi"));

        // Mumbai to Bangalore
        listOfFlights.add(new Flight("Fl011", "Mumbai", "Bangalore"));
        listOfFlights.add(new Flight("Fl012", "Mumbai", "Bangalore"));
        listOfFlights.add(new Flight("Fl013", "Mumbai", "Bangalore"));
        listOfFlights.add(new Flight("Fl014", "Mumbai", "Bangalore"));
        listOfFlights.add(new Flight("Fl015", "Mumbai", "Bangalore"));

        // Mumbai to Hyderabad
        listOfFlights.add(new Flight("Fl016", "Mumbai", "Hyderabad"));
        listOfFlights.add(new Flight("Fl017", "Mumbai", "Hyderabad"));
        listOfFlights.add(new Flight("Fl018", "Mumbai", "Hyderabad"));
        listOfFlights.add(new Flight("Fl019", "Mumbai", "Hyderabad"));
        listOfFlights.add(new Flight("Fl020", "Mumbai", "Hyderabad"));

        // Mumbai to Chennai
        listOfFlights.add(new Flight("Fl021", "Mumbai", "Chennai"));
        listOfFlights.add(new Flight("Fl022", "Mumbai", "Chennai"));
        listOfFlights.add(new Flight("Fl023", "Mumbai", "Chennai"));
        listOfFlights.add(new Flight("Fl024", "Mumbai", "Chennai"));
        listOfFlights.add(new Flight("Fl025", "Mumbai", "Chennai"));

        // Delhi to Mumbai
        listOfFlights.add(new Flight("Fl026", "Delhi", "Mumbai"));
        listOfFlights.add(new Flight("Fl027", "Delhi", "Mumbai"));
        listOfFlights.add(new Flight("Fl028", "Delhi", "Mumbai"));
        listOfFlights.add(new Flight("Fl029", "Delhi", "Mumbai"));
        listOfFlights.add(new Flight("Fl030", "Delhi", "Mumbai"));

        // Delhi to Pune
        listOfFlights.add(new Flight("Fl031", "Delhi", "Pune"));
        listOfFlights.add(new Flight("Fl032", "Delhi", "Pune"));
        listOfFlights.add(new Flight("Fl033", "Delhi", "Pune"));
        listOfFlights.add(new Flight("Fl034", "Delhi", "Pune"));
        listOfFlights.add(new Flight("Fl035", "Delhi", "Pune"));

        // Delhi to Bangalore
        listOfFlights.add(new Flight("Fl036", "Delhi", "Bangalore"));
        listOfFlights.add(new Flight("Fl037", "Delhi", "Bangalore"));
        listOfFlights.add(new Flight("Fl038", "Delhi", "Bangalore"));
        listOfFlights.add(new Flight("Fl039", "Delhi", "Bangalore"));
        listOfFlights.add(new Flight("Fl040", "Delhi", "Bangalore"));

        // Delhi to Kolkata
        listOfFlights.add(new Flight("Fl041", "Delhi", "Kolkata"));
        listOfFlights.add(new Flight("Fl042", "Delhi", "Kolkata"));
        listOfFlights.add(new Flight("Fl043", "Delhi", "Kolkata"));
        listOfFlights.add(new Flight("Fl044", "Delhi", "Kolkata"));
        listOfFlights.add(new Flight("Fl045", "Delhi", "Kolkata"));

        // Delhi to Goa
        listOfFlights.add(new Flight("Fl046", "Delhi", "Goa"));
        listOfFlights.add(new Flight("Fl047", "Delhi", "Goa"));
        listOfFlights.add(new Flight("Fl048", "Delhi", "Goa"));
        listOfFlights.add(new Flight("Fl049", "Delhi", "Goa"));
        listOfFlights.add(new Flight("Fl050", "Delhi", "Goa"));

        // Pune to Mumbai
        listOfFlights.add(new Flight("Fl051", "Pune", "Mumbai"));
        listOfFlights.add(new Flight("Fl052", "Pune", "Mumbai"));
        listOfFlights.add(new Flight("Fl053", "Pune", "Mumbai"));
        listOfFlights.add(new Flight("Fl054", "Pune", "Mumbai"));
        listOfFlights.add(new Flight("Fl055", "Pune", "Mumbai"));

        // Pune to Delhi
        listOfFlights.add(new Flight("Fl056", "Pune", "Delhi"));
        listOfFlights.add(new Flight("Fl057", "Pune", "Delhi"));
        listOfFlights.add(new Flight("Fl058", "Pune", "Delhi"));
        listOfFlights.add(new Flight("Fl059", "Pune", "Delhi"));
        listOfFlights.add(new Flight("Fl060", "Pune", "Delhi"));

        // Pune to Hyderabad
        listOfFlights.add(new Flight("Fl061", "Pune", "Hyderabad"));
        listOfFlights.add(new Flight("Fl062", "Pune", "Hyderabad"));
        listOfFlights.add(new Flight("Fl063", "Pune", "Hyderabad"));
        listOfFlights.add(new Flight("Fl064", "Pune", "Hyderabad"));
        listOfFlights.add(new Flight("Fl065", "Pune", "Hyderabad"));

        // Pune to Bangalore
        listOfFlights.add(new Flight("Fl066", "Pune", "Bangalore"));
        listOfFlights.add(new Flight("Fl067", "Pune", "Bangalore"));
        listOfFlights.add(new Flight("Fl068", "Pune", "Bangalore"));
        listOfFlights.add(new Flight("Fl069", "Pune", "Bangalore"));
        listOfFlights.add(new Flight("Fl070", "Pune", "Bangalore"));

        // Pune to Chennai
        listOfFlights.add(new Flight("Fl071", "Pune", "Chennai"));
        listOfFlights.add(new Flight("Fl072", "Pune", "Chennai"));
        listOfFlights.add(new Flight("Fl073", "Pune", "Chennai"));
        listOfFlights.add(new Flight("Fl074", "Pune", "Chennai"));
        listOfFlights.add(new Flight("Fl075", "Pune", "Chennai"));

        // Bangalore to Mumbai
        listOfFlights.add(new Flight("Fl076", "Bangalore", "Mumbai"));
        listOfFlights.add(new Flight("Fl077", "Bangalore", "Mumbai"));
        listOfFlights.add(new Flight("Fl078", "Bangalore", "Mumbai"));
        listOfFlights.add(new Flight("Fl079", "Bangalore", "Mumbai"));
        listOfFlights.add(new Flight("Fl080", "Bangalore", "Mumbai"));

        // Bangalore to Delhi
        listOfFlights.add(new Flight("Fl081", "Bangalore", "Delhi"));
        listOfFlights.add(new Flight("Fl082", "Bangalore", "Delhi"));
        listOfFlights.add(new Flight("Fl083", "Bangalore", "Delhi"));
        listOfFlights.add(new Flight("Fl084", "Bangalore", "Delhi"));
        listOfFlights.add(new Flight("Fl085", "Bangalore", "Delhi"));

        // Bangalore to Pune
        listOfFlights.add(new Flight("Fl086", "Bangalore", "Pune"));
        listOfFlights.add(new Flight("Fl087", "Bangalore", "Pune"));
        listOfFlights.add(new Flight("Fl088", "Bangalore", "Pune"));
        listOfFlights.add(new Flight("Fl089", "Bangalore", "Pune"));
        listOfFlights.add(new Flight("Fl090", "Bangalore", "Pune"));

        // Bangalore to Kolkata
        listOfFlights.add(new Flight("Fl091", "Bangalore", "Kolkata"));
        listOfFlights.add(new Flight("Fl092", "Bangalore", "Kolkata"));
        listOfFlights.add(new Flight("Fl093", "Bangalore", "Kolkata"));
        listOfFlights.add(new Flight("Fl094", "Bangalore", "Kolkata"));
        listOfFlights.add(new Flight("Fl095", "Bangalore", "Kolkata"));

        // Bangalore to Goa
        listOfFlights.add(new Flight("Fl096", "Bangalore", "Goa"));
        listOfFlights.add(new Flight("Fl097", "Bangalore", "Goa"));
        listOfFlights.add(new Flight("Fl098", "Bangalore", "Goa"));
        listOfFlights.add(new Flight("Fl099", "Bangalore", "Goa"));
        listOfFlights.add(new Flight("Fl100", "Bangalore", "Goa"));

        // Hyderabad to Mumbai
        listOfFlights.add(new Flight("Fl101", "Hyderabad", "Mumbai"));
        listOfFlights.add(new Flight("Fl102", "Hyderabad", "Mumbai"));
        listOfFlights.add(new Flight("Fl103", "Hyderabad", "Mumbai"));
        listOfFlights.add(new Flight("Fl104", "Hyderabad", "Mumbai"));
        listOfFlights.add(new Flight("Fl105", "Hyderabad", "Mumbai"));

        // Hyderabad to Pune
        listOfFlights.add(new Flight("Fl106", "Hyderabad", "Pune"));
        listOfFlights.add(new Flight("Fl107", "Hyderabad", "Pune"));
        listOfFlights.add(new Flight("Fl108", "Hyderabad", "Pune"));
        listOfFlights.add(new Flight("Fl109", "Hyderabad", "Pune"));
        listOfFlights.add(new Flight("Fl110", "Hyderabad", "Pune"));

        // Chennai to Delhi
        listOfFlights.add(new Flight("Fl111", "Chennai", "Delhi"));
        listOfFlights.add(new Flight("Fl112", "Chennai", "Delhi"));
        listOfFlights.add(new Flight("Fl113", "Chennai", "Delhi"));
        listOfFlights.add(new Flight("Fl114", "Chennai", "Delhi"));
        listOfFlights.add(new Flight("Fl115", "Chennai", "Delhi"));

        // Kolkata to Mumbai
        listOfFlights.add(new Flight("Fl116", "Kolkata", "Mumbai"));
        listOfFlights.add(new Flight("Fl117", "Kolkata", "Mumbai"));
        listOfFlights.add(new Flight("Fl118", "Kolkata", "Mumbai"));
        listOfFlights.add(new Flight("Fl119", "Kolkata", "Mumbai"));
        listOfFlights.add(new Flight("Fl120", "Kolkata", "Mumbai"));

        // Goa to Bangalore
        listOfFlights.add(new Flight("Fl121", "Goa", "Bangalore"));
        listOfFlights.add(new Flight("Fl122", "Goa", "Bangalore"));
        listOfFlights.add(new Flight("Fl123", "Goa", "Bangalore"));
        listOfFlights.add(new Flight("Fl124", "Goa", "Bangalore"));
        listOfFlights.add(new Flight("Fl125", "Goa", "Bangalore"));
    }

    @Override
    public List<Flight> getAllFlights() {
        return listOfFlights;
    }
}
