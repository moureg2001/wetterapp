package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityService extends CrudRepository<City, Long> {

}
