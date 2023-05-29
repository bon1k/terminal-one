package com.airportservice.terminalone.mapper;

import com.airportservice.terminalone.dto.IdentityDto;
import com.airportservice.terminalone.entity.Identity;

public interface IEntityMapper<E extends Identity, D extends IdentityDto> {
    E mapToEntity(D dto);
    D mapToDto(E entity);

}