package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherService extends CrudRepository<Weather, Long> {
}
