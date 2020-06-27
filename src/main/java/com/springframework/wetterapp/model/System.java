package com.springframework.wetterapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Data
@Entity
@Table(name = "system")
public class System extends Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//System parameter, do not use it
	private String message;
	//Country code (GB, JP etc.)
	private String country;
	//Sunrise time
	private LocalTime   sunRise;
	//Sunset time
	private LocalTime  sunSet;
	public System() {
	}
	public System(String message, String country, LocalTime sunRise, LocalTime sunSet) {
		this.message = message;
		this.country = country;
		this.sunRise = sunRise;
		this.sunSet = sunSet;
	}

	public System(Long id, String message, String country, LocalTime sunRise, LocalTime sunSet) {
		this.id = id;
		this.message = message;
		this.country = country;
		this.sunRise = sunRise;
		this.sunSet = sunSet;
	}
}
