package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Snow;
import org.springframework.data.repository.CrudRepository;

public interface SnowService extends CrudRepository<Snow,Long> {
}
