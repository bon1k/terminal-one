package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Route;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public interface IRouteService extends ICrudService<Route>{
    public LocalDateTime timeOnRoute(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime);
    public List<Route> findRoutesByDate(LocalDate departureDate);
}
