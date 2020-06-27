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
public class Coordinate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //City geo location, latitude
    private float lat;
    //City geo location, longitude
    private float lon;
    //Number of lines returned by this API call
    private LocalTime cnt;
    //Data receiving time
    private LocalTime dt;

    public Coordinate() {

    }

    public Coordinate(float lat, float lon, LocalTime cnt, LocalTime dt) {
        this.lat = lat;
        this.lon = lon;
        this.cnt = cnt;
        this.dt = dt;
    }

    public Coordinate(Long id, float lat, float lon, LocalTime cnt, LocalTime dt) {
        this.id = id;
        this.lat = lat;
        this.lon = lon;
        this.cnt = cnt;
        this.dt = dt;
    }
}
