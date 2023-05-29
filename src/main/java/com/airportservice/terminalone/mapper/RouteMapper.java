package com.airportservice.terminalone.mapper;

import com.airportservice.terminalone.dto.PortDto;
import com.airportservice.terminalone.dto.RouteDto;
import com.airportservice.terminalone.entity.Port;
import com.airportservice.terminalone.entity.Route;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class RouteMapper implements IEntityMapper<Route, RouteDto> {

}
