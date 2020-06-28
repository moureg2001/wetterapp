package com.springframework.wetterapp.controller;

import com.springframework.wetterapp.model.City;
import com.springframework.wetterapp.services.CityRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CityController {
    @Getter
    private final CityRepository cityRepository;
    @Autowired
    public CityController(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }
    @GetMapping("/cities")
    public List<City> getCities(){
        return (List<City>) cityRepository.findAll();
    }

    @PostMapping("/cities")
    void addCity(@RequestBody City city) {
        cityRepository.save(city);
    }
}
