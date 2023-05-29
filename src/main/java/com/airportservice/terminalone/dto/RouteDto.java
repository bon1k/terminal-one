package com.airportservice.terminalone.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode
public class RouteDto extends IdentityDto {
    private Long departPortId;
    private Long arrivalPortId;
    private Long planeId;
    private LocalDateTime departureDateTime;
    private LocalDateTime arrivalDateTime;
}
