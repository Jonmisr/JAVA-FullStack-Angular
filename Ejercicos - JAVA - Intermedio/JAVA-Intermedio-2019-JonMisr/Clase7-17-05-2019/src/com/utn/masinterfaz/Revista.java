package com.utn.masinterfaz;

public class Revista extends Publicacion{

	private int numero;
	
	public Revista(String codigo, String titulo, int anioPublicacion, int numero) {
		
		super(codigo, titulo, anioPublicacion);
		this.numero = numero;
	}
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Revista ["  + "codigo=" + getCodigo() + ", titulo=" + getTitulo()
				+ ", anioPublicacion=" + getAnioPublicacion() + " ,numero=" + numero + "]";
	}
	
	
}
