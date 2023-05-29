package com.airportservice.terminalone.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PassengerDto extends IdentityDto {
    private String lastName;
    private String name;
    private String middleName;
    private String email;
    private Date dateBirth;
    private Long userId;
}
