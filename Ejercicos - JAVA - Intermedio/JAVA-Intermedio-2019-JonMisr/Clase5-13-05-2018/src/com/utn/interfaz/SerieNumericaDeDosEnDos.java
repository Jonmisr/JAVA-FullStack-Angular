package com.utn.interfaz;

public class SerieNumericaDeDosEnDos implements ISeriesNumericasHerencia {

	private int iniciar;
	private int valor;
	private int anterior;
	
	public SerieNumericaDeDosEnDos() {
		iniciar = 0;
		valor = 0;
		anterior = 0;
	}
	
	public int getIniciar() {
		return iniciar;
	}

	public void setIniciar(int iniciar) {
		this.iniciar = iniciar;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}
	
	public int getAnterior() {
		return anterior;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;	
		anterior = valor - 2;
	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 2;
	}

}
