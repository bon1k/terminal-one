/*
package com.airportservice.terminalone.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
// TODO: проверить все ли поля в бд
public class Trip extends Identity {
    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route routeId;
    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private Passenger passengerId;
    private String seat;
    private BigDecimal minTariff;
}
*/
