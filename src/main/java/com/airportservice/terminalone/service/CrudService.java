package com.airportservice.terminalone.service;

import com.airportservice.terminalone.entity.Identity;
import com.airportservice.terminalone.repository.IBaseRepository;

public abstract class CrudService <T extends Identity> implements ICrudService<T>{

    public abstract IBaseRepository <T> getRepository();
    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public T get(Long id) {
        return getRepository().findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        getRepository().deleteById(id);
    }
}
