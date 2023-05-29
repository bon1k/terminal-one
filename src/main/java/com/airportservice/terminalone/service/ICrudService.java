package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Identity;

import java.util.Optional;

public interface ICrudService<T extends Identity> {
    public T save (T entity);
    public T get (Long id);
    void  delete (Long id);
}
