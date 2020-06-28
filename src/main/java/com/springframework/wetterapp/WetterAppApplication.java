package com.springframework.wetterapp;

import com.springframework.wetterapp.model.City;
import com.springframework.wetterapp.services.CityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class WetterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(WetterAppApplication.class, args);
	}
	@Bean
	CommandLineRunner init(CityRepository cityRepository) {
		return args -> {
			Stream.of(new City("Marokko","MA"), new City("Germany","DE"),new City("United Kingdom","UK"),
					new City("Japan","JN")).forEach(cities -> {
				City city = new City(cities.getName(),cities.getCountry());
				cityRepository.save(city);
			});
			cityRepository.findAll().forEach(System.out::println);
		};
	}
}
