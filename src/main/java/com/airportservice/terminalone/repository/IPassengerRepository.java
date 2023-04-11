package com.airportservice.terminalone.repository;

import com.airportservice.terminalone.entity.Passenger;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IPassengerRepository extends IBaseRepository<Passenger>{

}
