package com.springframework.wetterapp.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Main {
	//Temperature in (°C, °K and in °F)
	private TemperatureUnit temperatureUnit;
	//Humidity in (%)
	private float humidity;
	//Minimum temperature at the moment.
	// This is deviation from current temp that is possible for large cities and megalopolises geographically expanded
	// (use these parameter optionally) in (°C, °K and in °F)
	private float tempMin;
	//Maximum temperature at the moment.
	// This is deviation from current temp that is possible for large cities
	// and megalopolises geographically expanded (use these parameter optionally)  in (°C, °K and in °F)
	private float tempMax;
	//Atmospheric pressure (on the sea level, if there is no sea_level or grnd_level data) in (hPa)
	private float pressure;
	//Atmospheric pressure on the sea level in (hPa)
	private float sea_level ;
	//Atmospheric pressure on the ground level in (hPa)
	private float grnd_level;
	
	
}
