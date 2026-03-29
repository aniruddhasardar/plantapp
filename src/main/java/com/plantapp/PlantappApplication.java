package com.plantapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PlantappApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantappApplication.class, args);
	}

}
