package com.utn.figurasAbstractas;

public class Cuadrado extends Figura {

	private double lado;
	
	public Cuadrado(String color, double lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double calcularAreaFigura() {
		
		return lado * lado;
	}

	public double getLado() {

		return lado;
	}

}
