package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Temperature;
import org.springframework.data.repository.CrudRepository;

public interface TemperatureService extends CrudRepository<Temperature, Long> {
}
