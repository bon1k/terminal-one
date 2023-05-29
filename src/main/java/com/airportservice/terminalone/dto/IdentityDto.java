package com.airportservice.terminalone.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@EqualsAndHashCode
public abstract class IdentityDto {
    private Long id;
}
