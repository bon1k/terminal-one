/*
package com.airportservice.terminalone.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Staff extends Identity {
     private String lastName;
     private String name;
     private String middleName;
     private String email;
     private String position;
     private String phone;
     private Date dateBirth;

     @ManyToOne
     @JoinColumn(name = "role_id")
     private Role role;

     @OneToOne
     @JoinColumn(name = "user_id")
     private User userId;
}
*/
