package com.airportservice.terminalone.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class User extends Identity {
    private String name;
    private String lastName;
}
