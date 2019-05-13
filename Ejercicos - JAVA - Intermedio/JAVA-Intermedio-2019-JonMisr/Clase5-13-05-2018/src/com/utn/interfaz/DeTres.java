package com.utn.interfaz;

public class DeTres implements ISeriesNumericasHerencia {

	private int iniciar;
	private int valor;
	private int anterior;
	
	public DeTres() {
		iniciar = 0;
		valor = 0;
		anterior = 0;
	}
	
	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 3;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor - 3;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = valor - 3;
	}

	@Override
	public int getAnterior() {
		
		return anterior;
	}
}
