package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "weather")
public class Weather extends Serializable {
    //Weather condition id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Group of weather parameters (Rain, Snow, Extreme etc.)
    private String main;
    //Weather condition within the group
    private String decription;
    //Weather icon id
    private String icon;

    public Weather() {
    }

    public Weather(String main, String decription, String icon) {
        this.main = main;
        this.decription = decription;
        this.icon = icon;
    }

    public Weather(Long id, String main, String decription, String icon) {
        this.id = id;
        this.main = main;
        this.decription = decription;
        this.icon = icon;
    }
}
