package com.utn.ejercicio;

public class Disco extends Multimedia{

	private Genero genero;
	
	public Disco(String titulo, String autor, Formato formato, String duracion, Genero genero) {
		
		super(titulo, autor, formato, duracion);
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public String toString() {
		
		return "Disco [" + "titulo=" + getTitulo() + ", autor="
				+ getAutor() + ", formato=" + getFormato() + ", duracion=" + getDuracion() + " ,genero=" + genero  + "]";
				
	}
}
