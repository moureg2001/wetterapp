package com.springframework.wetterapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "snow")
public class Snow extends Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float snowVolumeLastHour;
    private float snowVolumeLastTreeHour;

    public Snow() {
    }

    public Snow(float snowVolumeLastHour, float snowVolumeLastTreeHour) {
        this.snowVolumeLastHour = snowVolumeLastHour;
        this.snowVolumeLastTreeHour = snowVolumeLastTreeHour;
    }

    public Snow(Long id, float snowVolumeLastHour, float snowVolumeLastTreeHour) {
        this.id = id;
        this.snowVolumeLastHour = snowVolumeLastHour;
        this.snowVolumeLastTreeHour = snowVolumeLastTreeHour;
    }
}
