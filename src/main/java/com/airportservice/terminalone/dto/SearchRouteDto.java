package com.airportservice.terminalone.dto;

import com.airportservice.terminalone.entity.Port;
import com.airportservice.terminalone.entity.Route;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
@Getter
@Setter
@Builder
@EqualsAndHashCode
public class SearchRouteDto {

    private LocalTime timeOnRoute;
    private String aviaCompanyName;
    private List<Route> RoutesByDepartDate;
    private List<Route> RoutesByReturnDate;
    //private Tariff tariff;
}
