package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.SearchRouteDto;
import com.airportservice.terminalone.service.IRouteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/searchRoute")
public class SearchRouteController {


    IRouteService routeService;
    List<SearchRouteDto> searchRouteDto;

    public SearchRouteController(IRouteService routeService, List<SearchRouteDto> searchRouteDto) {
        this.routeService = routeService;
        this.searchRouteDto = searchRouteDto;
    }

    @GetMapping("/allRouteByDateDepart")
    public List<SearchRouteDto> findByData(
            @RequestParam LocalDate dateDepart,
            @RequestParam String departPort,
            @RequestParam String arrivalPort
    ) {

        SearchRouteDto srd = SearchRouteDto.builder().RoutesByDepartDate(departPort).timeOnRoute().aviaCompanyName().build();

        return null;
    }

}
