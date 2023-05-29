package com.airportservice.terminalone.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class PlaneDto extends IdentityDto{
    private String sideCode;
    // TODO: добавить в бд private String aviaCompanyName;
    private Integer flightRange;
    private Integer passengerCapacity;
    private Integer fuelConsumption;
    private Long portId;
}
