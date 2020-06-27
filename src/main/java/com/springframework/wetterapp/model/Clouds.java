package com.springframework.wetterapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "clouds")
public class Clouds implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private float cloudiness;

    public Clouds() {
    }

    public Clouds(float cloudiness) {
        this.cloudiness = cloudiness;
    }

    public Clouds(Long id, float cloudiness) {
        this.id = id;
        this.cloudiness = cloudiness;
    }
}
