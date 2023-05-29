package com.airportservice.terminalone.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.TimeZone;
@Getter
@Setter
@EqualsAndHashCode
public class PortDto extends IdentityDto {
    private String name;
    private String country;
    private String city;
    private String code;
    private long timeZone;
}
