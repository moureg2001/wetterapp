package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Rain;
import org.springframework.data.repository.CrudRepository;

public interface RainService extends CrudRepository<Rain,Long> {
}
