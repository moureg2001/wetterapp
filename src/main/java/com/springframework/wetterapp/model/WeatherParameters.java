package com.springframework.wetterapp.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "weatherParameters")
public class WeatherParameters extends Serializable {
	// City identification
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	// Data receiving time
	private LocalDateTime dt;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false, unique = true)
	private City city;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coordinate_id", nullable = false, unique = true)
	private Coordinate coordinate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "system_id", nullable = false, unique = true)
	private System system;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "main_id", nullable = false, unique = true)
	private Main main;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "city_id", nullable = false, unique = true)
	private Wind wind;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clouds_id", nullable = false, unique = true)
	private Clouds clouds;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "weather_id", nullable = false, unique = true)
	private Weather weather;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rain_id", nullable = false, unique = true)
	private Rain rain;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "snow_id", nullable = false, unique = true)
	private Snow snow;

}
