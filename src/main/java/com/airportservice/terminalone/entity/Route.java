package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Route extends Identity {
    private Long departPortId;
    private Long arrivalPortId;
    private Long planeId;
    private LocalDateTime departureDateTime;
    //TODO как то должно рассчитываться само от расстояния и скорости самолета
    private LocalDateTime arrivalDateTime;
}
