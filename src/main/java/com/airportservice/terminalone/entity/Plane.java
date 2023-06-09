package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Plane extends Identity{
    private String sideCode;
    // TODO: добавить в бд private String aviaCompanyName;
    private Integer flightRange;
    private Integer passengerCapacity;
    private Integer fuelConsumption;
    private Long portId;
}
