package com.airportservice.terminalone;

import com.airportservice.terminalone.entity.Passenger;
import com.airportservice.terminalone.repository.IPassengerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TerminalOneApplication {

	public static void main(String[] args) {

		SpringApplication.run(TerminalOneApplication.class, args);

	}

}
