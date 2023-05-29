package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.PortDto;
import com.airportservice.terminalone.entity.Port;
import com.airportservice.terminalone.mapper.IEntityMapper;
import com.airportservice.terminalone.service.ICrudService;
import com.airportservice.terminalone.service.IPortService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/port")
public class PortController extends CrudController<Port, PortDto>{

    IPortService portService;
    IEntityMapper<Port, PortDto> entityMapper;

    public PortController(IPortService portService, IEntityMapper<Port, PortDto> entityMapper) {
        this.portService = portService;
        this.entityMapper = entityMapper;
    }

    @Override
    public ICrudService<Port> getService() {
        return portService;
    }

    @Override
    public IEntityMapper<Port, PortDto> getMapper() {
        return entityMapper;
    }
}
