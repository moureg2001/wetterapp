package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Wind;
import org.springframework.data.repository.CrudRepository;

public interface WindService extends CrudRepository<Wind, Long> {
}
