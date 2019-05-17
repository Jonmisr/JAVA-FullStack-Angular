package com.utn.masinterfaz;

public class Libro extends Publicacion implements Prestable{

	private boolean prestado;
	
	public Libro(String codigo, String titulo, int anioPublicacion) {
		
		super(codigo, titulo, anioPublicacion);
		this.prestado = false;
	}

	public boolean getPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar() {
		this.setPrestado(true);
	}
	
	public void devolver() {
		this.setPrestado(false);
	}
	
	public boolean prestado() {
		return this.getPrestado();
	}
	
	@Override
	public String toString() {
		return "Libro ["  + "codigo=" + getCodigo() + ", titulo=" + getTitulo()
				+ ", anioPublicacion=" + getAnioPublicacion() + " ,prestado=" + prestado + "]";
	}
	
}
