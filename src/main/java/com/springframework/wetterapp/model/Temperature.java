package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "temperature")
public class Temperature extends Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Day temperature
    private float day;
    //Min daily temperature
    private float min;
    //Max daily temperature
    private float max;
    //Night temperature
    private float night;
    //Evening temperature
    private float eve;
    //Morning temperature
    private float morn;
    @Enumerated(EnumType.STRING)
    private TemperatureUnit temperatureUnit;

    public Temperature() {

    }
    public Temperature(float day, float min, float max, float night, float eve, float morn, TemperatureUnit temperatureUnit) {
        this.day = day;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
        this.temperatureUnit = temperatureUnit;
    }
    public Temperature(Long id, float day, float min, float max, float night, float eve, float morn, TemperatureUnit temperatureUnit) {
        this.id = id;
        this.day = day;
        this.min = min;
        this.max = max;
        this.night = night;
        this.eve = eve;
        this.morn = morn;
        this.temperatureUnit = temperatureUnit;
    }
}
