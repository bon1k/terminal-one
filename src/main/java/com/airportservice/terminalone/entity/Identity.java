package com.airportservice.terminalone.entity;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Setter
@Getter
@MappedSuperclass
@EntityListeners({AuditingEntityListener.class})
@EqualsAndHashCode
public abstract class Identity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
