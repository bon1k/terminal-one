package com.airportservice.terminalone.repository;


import com.airportservice.terminalone.entity.Passenger;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

@Repository
public interface IPassengerRepository extends IBaseRepository<Passenger>{
}
