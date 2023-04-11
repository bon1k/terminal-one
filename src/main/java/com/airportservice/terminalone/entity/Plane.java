package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Plane {
    private String sideNumber;
    private ModelPlane modelPlane;
    private Airport currentParkingAirport;
    private Integer flightRange;
    private Integer numberOfSeat;
    private Integer fuelConsumption;
}
