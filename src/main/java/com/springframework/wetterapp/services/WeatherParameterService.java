package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.WeatherParameters;
import org.springframework.data.repository.CrudRepository;

public interface WeatherParameterService extends CrudRepository<WeatherParameters, Long> {
}
