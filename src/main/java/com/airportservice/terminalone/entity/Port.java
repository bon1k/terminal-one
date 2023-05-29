package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.ZoneId;
import java.util.TimeZone;
@Getter
@Setter
@Entity
public class Port extends Identity{
    private String name;
    private String country;
    private String city;
    private String code;
    private long timeZone;
}
