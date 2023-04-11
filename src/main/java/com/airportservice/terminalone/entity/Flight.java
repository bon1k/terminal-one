package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Flight {
    private Airport airportDepart;
    private Airport airportArrival;
    private LocalDateTime timeArrival;
    private Plane plane;
}
