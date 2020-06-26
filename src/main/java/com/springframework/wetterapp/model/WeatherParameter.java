package com.springframework.wetterapp.model;

import java.time.LocalDateTime;

public class WeatherParameter {
	// City identification
	private  Long id;
	// 	Data receiving time
	private LocalDateTime dt;
	private City cityName;
	private Weather weather;

}
