package com.example.demosb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosbApplication implements CommandLineRunner{



	DemosbApplication(@Autowired Vehicle vehicle) {
		System.out.println("Constructor of DemosbApplication called");
		System.out.println(vehicle);
	}

	public static void main(String[] args) {
		SpringApplication.run(DemosbApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
}

}
