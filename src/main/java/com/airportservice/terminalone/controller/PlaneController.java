package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.PlaneDto;
import com.airportservice.terminalone.entity.Plane;
import com.airportservice.terminalone.mapper.IEntityMapper;
import com.airportservice.terminalone.service.ICrudService;
import com.airportservice.terminalone.service.IPlaneService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/plane")
public class PlaneController extends CrudController<Plane, PlaneDto>{

IPlaneService planeService;
IEntityMapper <Plane, PlaneDto> entityMapper;

    public PlaneController(IPlaneService planeService, IEntityMapper<Plane, PlaneDto> entityMapper) {
        this.planeService = planeService;
        this.entityMapper = entityMapper;
    }

    @Override
    public ICrudService<Plane> getService() {
        return planeService;
    }

    @Override
    public IEntityMapper<Plane, PlaneDto> getMapper() {
        return entityMapper;
    }
}
