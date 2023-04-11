package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.TimeZone;
@Getter
@Setter
public class Airport {
    private String name;
    private String city;
    private String country;
    private TimeZone timeZone;
}
