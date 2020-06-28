package com.springframework.wetterapp.services;

import com.springframework.wetterapp.model.Main;
import org.springframework.data.repository.CrudRepository;

public interface MainService extends CrudRepository<Main, Long> {
}
