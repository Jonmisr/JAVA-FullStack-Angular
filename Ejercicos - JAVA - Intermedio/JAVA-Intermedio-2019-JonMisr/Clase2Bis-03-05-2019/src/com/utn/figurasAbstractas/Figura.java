package com.utn.figurasAbstractas;

public abstract class Figura {

	private String color;
	
	public abstract double calcularAreaFigura();
	
	public Figura(String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return color;
	}
	
	
}
