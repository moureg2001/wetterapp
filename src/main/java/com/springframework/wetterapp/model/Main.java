package com.springframework.wetterapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Main {
	
	private TemperatureUnit temperatureUnit;
	private float humidity;
	private float tempMin;
	private float tempMax;
	private float pressure;
	private float pressureSeaLevel;
	private float pressureGrndLevel;
	
	
}
