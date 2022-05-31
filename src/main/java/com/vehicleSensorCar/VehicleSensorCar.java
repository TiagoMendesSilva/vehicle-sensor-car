package com.vehicleSensorCar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class VehicleSensorCar {
    public static void main(String[] args) {
        SpringApplication.run(VehicleSensorCar.class, args);
    }
}
