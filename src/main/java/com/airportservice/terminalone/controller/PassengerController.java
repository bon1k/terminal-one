package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.PassengerDto;
import com.airportservice.terminalone.entity.Passenger;
import com.airportservice.terminalone.mapper.IEntityMapper;
import com.airportservice.terminalone.service.ICrudService;
import com.airportservice.terminalone.service.IPassengerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController extends CrudController<Passenger, PassengerDto>{

    IPassengerService passengerService;
    IEntityMapper<Passenger, PassengerDto> entityMapper;

    public PassengerController(IPassengerService passengerService, IEntityMapper<Passenger, PassengerDto> entityMapper) {
        this.passengerService = passengerService;
        this.entityMapper = entityMapper;
    }

    @Override
    public ICrudService<Passenger> getService() {
        return passengerService;
    }

    @Override
    public IEntityMapper<Passenger, PassengerDto> getMapper() {
        return entityMapper;
    }
}
