package com.flightbookingApplication.learnl19.Entity;


public class Flight {
    private  String flightno;
    private  String flightSource;
    private  String flightDestinatio;

    public Flight(String flightno, String flightSource, String flightDestinatio) {
        this.flightno = flightno;
        this.flightSource = flightSource;
        this.flightDestinatio = flightDestinatio;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getFlightSource() {
        return flightSource;
    }

    public void setFlightSource(String flightSource) {
        this.flightSource = flightSource;
    }

    public String getFlightDestinatio() {
        return flightDestinatio;
    }

    public void setFlightDestinatio(String flightDestinatio) {
        this.flightDestinatio = flightDestinatio;
    }
}
