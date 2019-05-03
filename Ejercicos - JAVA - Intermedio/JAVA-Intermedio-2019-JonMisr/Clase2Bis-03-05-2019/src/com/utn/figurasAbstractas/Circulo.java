package com.utn.figurasAbstractas;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double calcularAreaFigura() {
		
		return Math.PI * Math.pow(radio, 2);
	}
}
