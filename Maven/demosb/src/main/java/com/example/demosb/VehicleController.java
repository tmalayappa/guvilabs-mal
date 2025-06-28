package com.example.demosb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;


	@RestController
    public class VehicleController {
        VehicleController(@Autowired Vehicle vehicle, 
        @Autowired Config config,
        @Value("${developer.name}") String dev
        ) {
            System.out.println("Constructor of VehicleController");
            System.out.println(vehicle);
            System.out.println(config.getMongoDBConnection());
            System.out.println(config.getMySQLConnection());
            System.out.println(dev);
        }
    
    }   

