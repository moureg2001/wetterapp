package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "city")
public class City extends Serializable {
    //City identification
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //City name
    private String name;
    //Country code (GB, JP etc.)
    private String country

    public City() {
    }

    public City(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public City(Long id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }

}
