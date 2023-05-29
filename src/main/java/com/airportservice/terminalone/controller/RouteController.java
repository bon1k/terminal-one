package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.PortDto;
import com.airportservice.terminalone.dto.RouteDto;
import com.airportservice.terminalone.entity.Port;
import com.airportservice.terminalone.entity.Route;
import com.airportservice.terminalone.mapper.IEntityMapper;
import com.airportservice.terminalone.service.ICrudService;
import com.airportservice.terminalone.service.IPortService;
import com.airportservice.terminalone.service.IRouteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/route")
public class RouteController extends CrudController<Route, RouteDto>{

    IRouteService routeService;
    IEntityMapper<Route, RouteDto> entityMapper;

    public RouteController(IRouteService routeService, IEntityMapper<Route, RouteDto> entityMapper) {
        this.routeService = routeService;
        this.entityMapper = entityMapper;
    }

    @Override
    public ICrudService<Route> getService() {
        return routeService;
    }

    @Override
    public IEntityMapper<Route, RouteDto> getMapper() {
        return entityMapper;
    }
}
