package com.airportservice.terminalone.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Staff {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     String position;
     int securityLevel;
}
