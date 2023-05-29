package com.airportservice.terminalone.service;

import com.airportservice.terminalone.dto.PassengerDto;
import com.airportservice.terminalone.entity.Passenger;
import com.airportservice.terminalone.repository.IBaseRepository;
import com.airportservice.terminalone.repository.IPassengerRepository;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Service
public class PassengerService extends CrudService<Passenger> implements IPassengerService{
    IPassengerRepository passengerRepository;

    public PassengerService(IPassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    @Override
    public IBaseRepository<Passenger> getRepository() {
        return passengerRepository;
    }
}

