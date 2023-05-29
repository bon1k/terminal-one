package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Route;
import com.airportservice.terminalone.repository.IBaseRepository;
import com.airportservice.terminalone.repository.IRouteRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class RouteService extends CrudService<Route> implements IRouteService {

    IRouteRepository routeRepository;

    public RouteService(IRouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }


    @Override
    public IBaseRepository<Route> getRepository() {
        return routeRepository;
    }

    @Override
    // TODO переделать с часовыми поясами
    public LocalDateTime timeOnRoute(LocalDateTime departureDateTime, LocalDateTime arrivalDateTime) {
        return arrivalDateTime.minusHours(departureDateTime.getHour());
    }

    @Override
    public List<Route> findRoutesByDate(LocalDate departureDate) {
        return routeRepository.findDepartureDateTime(departureDate.atStartOfDay());
    }
}