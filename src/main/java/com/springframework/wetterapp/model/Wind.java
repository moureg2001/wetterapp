package com.springframework.wetterapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "wind")
public class Wind implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Wind speed in (m/s)
    private float speed;
    //Wind direction degrees (meteorological)
    private float direction;
    //Wind gust in (m/s)
    private float gust;

    public Wind() {
    }

    public Wind(float speed, float direction, float gust) {
        this.speed = speed;
        this.direction = direction;
        this.gust = gust;
    }

    public Wind(Long id, float speed, float direction, float gust) {
        this.id = id;
        this.speed = speed;
        this.direction = direction;
        this.gust = gust;
    }
}
