package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "main")
public class Main implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Temperature in (°C, °K and in °F)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "temperature_id", nullable = false, unique = true)
    private Temperature temperature;
    //Humidity in (%)
    private float humidity;
    //Minimum temperature at the moment.
    // This is deviation from current temp that is possible for large cities and megalopolises geographically expanded
    // (use these parameter optionally) in (°C, °K and in °F)
    private float tempMin;
    //Maximum temperature at the moment.
    // This is deviation from current temp that is possible for large cities
    // and megalopolises geographically expanded (use these parameter optionally)  in (°C, °K and in °F)
    private float tempMax;
    //Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data) in (hPa)
    private float pressure;
    //Atmospheric pressure on the sea level in (hPa)
    private float sea_level;
    //Atmospheric pressure on the ground level in (hPa)
    private float grnd_level;

    public Main() {

    }

    public Main(Temperature temperature, float humidity, float tempMin, float tempMax, float pressure, float sea_level, float grnd_level) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }

    public Main(Long id, Temperature temperature, float humidity, float tempMin, float tempMax, float pressure, float sea_level, float grnd_level) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.sea_level = sea_level;
        this.grnd_level = grnd_level;
    }
}
