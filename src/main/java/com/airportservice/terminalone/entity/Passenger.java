package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Passenger extends Identity {
    private String lastName;
    private String name;
    private String middleName;
    private String email;
    private Date dateBirth;
    private Long userId;
    //TODO: добавить в бд
//    private String gender;
//    private Integer phoneNumber;
//    private DocumentProofIdentity documentProofIdentity;
}
