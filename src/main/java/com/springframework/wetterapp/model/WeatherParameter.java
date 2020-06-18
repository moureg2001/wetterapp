package com.springframework.wetterapp.model;

import java.time.LocalDateTime;

public class WeatherParameter {
	
	private  Long cityId;
	private LocalDateTime dataReceivingTime;
	private String cityName;
	private Weather weather;

}
