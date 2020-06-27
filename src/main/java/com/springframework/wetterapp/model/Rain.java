package com.springframework.wetterapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "rain")
public class Rain extends Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float precipitationVolumeLastHour;
    private float precipitationVolumeLastTreeHour;


    public Rain() {

    }
    public Rain(float precipitationVolumeLastHour, float precipitationVolumeLastTreeHour) {
        this.precipitationVolumeLastHour = precipitationVolumeLastHour;
        this.precipitationVolumeLastTreeHour = precipitationVolumeLastTreeHour;
    }

    public Rain(Long id, float precipitationVolumeLastHour, float precipitationVolumeLastTreeHour) {
        this.id = id;
        this.precipitationVolumeLastHour = precipitationVolumeLastHour;
        this.precipitationVolumeLastTreeHour = precipitationVolumeLastTreeHour;
    }
}
