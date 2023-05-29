package com.airportservice.terminalone.repository;

import com.airportservice.terminalone.entity.Route;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface IRouteRepository extends IBaseRepository<Route> {
    public List<Route> findDepartureDateTime(LocalDateTime localDate);
}
