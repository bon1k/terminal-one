package com.airportservice.terminalone.mapper;

import com.airportservice.terminalone.dto.PortDto;
import com.airportservice.terminalone.entity.Port;
import org.mapstruct.Mapper;
import org.springframework.context.annotation.Primary;

@Mapper(componentModel = "spring")
public abstract class PortMapper implements IEntityMapper<Port, PortDto> {

}
