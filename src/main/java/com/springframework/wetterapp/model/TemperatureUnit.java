package com.springframework.wetterapp.model;

public enum TemperatureUnit {
	Celsius("Celsius","°C"),
	Kelvin("Kelvin","°K"),
	Fahrenheit("Fahrenheit","°F");
	
	String name;
	String sign;
	TemperatureUnit(String name,String sign) {
		this.name = name;
		this.sign = sign;
	}
	
	@Override
	public String toString() {
	    return name;
	}
}
