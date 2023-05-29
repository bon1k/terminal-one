package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.dto.IdentityDto;
import com.airportservice.terminalone.entity.Identity;
import com.airportservice.terminalone.mapper.IEntityMapper;
import com.airportservice.terminalone.service.ICrudService;
import org.springframework.web.bind.annotation.*;

public abstract class CrudController<E extends Identity, D extends IdentityDto> {

    public abstract ICrudService<E> getService();

    public abstract IEntityMapper<E, D> getMapper();

    @GetMapping("/{id}")
    public D get(@PathVariable Long id) {
        E entity = getService().get(id);
        return getMapper().mapToDto(entity);
    }

    @PostMapping
    public D save(@RequestBody D dtoToSave) {
        E entity = getMapper().mapToEntity(dtoToSave);
        entity = getService().save(entity);
        return getMapper().mapToDto(entity);
    }

    @PutMapping
    public D update(@RequestBody D dtoToUpdate) {
        E entity = getMapper().mapToEntity(dtoToUpdate);
        entity = getService().save(entity);
        return getMapper().mapToDto(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        getService().delete(id);
    }
}