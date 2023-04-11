package com.airportservice.terminalone.controller;

import com.airportservice.terminalone.entity.Passenger;
import com.airportservice.terminalone.service.IPassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private IPassengerService passengerService;

    @GetMapping("/{id}")
    public Passenger getPassenger(@PathVariable Long id) {
        return passengerService.findById(id).orElseThrow();
    }

    @PostMapping("/register")
    public Passenger save(@RequestBody Passenger passenger) {
        return passengerService.save(passenger);
    }


}
