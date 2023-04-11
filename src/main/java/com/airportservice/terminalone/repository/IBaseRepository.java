package com.airportservice.terminalone.repository;

import org.springframework.data.repository.CrudRepository;

public interface IBaseRepository<T> extends CrudRepository<T, Long>{

}
