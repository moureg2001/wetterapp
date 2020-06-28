package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Coordinate;
import org.springframework.data.repository.CrudRepository;

public interface CoordinateService extends CrudRepository<Coordinate,Long> {
}
