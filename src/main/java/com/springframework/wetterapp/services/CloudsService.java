package com.springframework.wetterapp.services;
import org.springframework.data.repository.CrudRepository;
import com.springframework.wetterapp.model.Clouds;

public interface CloudsService extends CrudRepository<Clouds, Long> {

}
