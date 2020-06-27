package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "coordinate")
public class Coordinate extends Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id;
    //City geo location, latitude
    private final float lat,
    //City geo location, longitude
    private final float lon,
    //Number of lines returned by this API call
    private final LocalTime cnt;
    //Data receiving time
    private final LocalTime dt;

    public Coordinate() {

    }

    public Coordinate(float lat, float lon, LocalTime cnt, LocalTime dt) {
        this.lat = lat;
        this.lon = lon;
        this.cnt = cnt;
        this.dt = dt;
    }
}
