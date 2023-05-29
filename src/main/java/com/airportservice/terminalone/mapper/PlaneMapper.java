package com.airportservice.terminalone.mapper;

import com.airportservice.terminalone.dto.PlaneDto;
import com.airportservice.terminalone.entity.Plane;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class PlaneMapper implements IEntityMapper<Plane, PlaneDto>{
}
