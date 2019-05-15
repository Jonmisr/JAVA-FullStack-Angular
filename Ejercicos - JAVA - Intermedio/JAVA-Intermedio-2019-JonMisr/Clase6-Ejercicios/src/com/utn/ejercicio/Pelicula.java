package com.utn.ejercicio;

public class Pelicula extends Multimedia{

	private String actor;
	private String actriz;
	
	public Pelicula(String titulo, String autor, Formato formato, String duracion,String actor, String actriz) {
	
		super(titulo, autor, formato, duracion);
		if (actor == null && actriz == null) {
			throw new ExceptionInInitializerError("No Especifico Ningun Autor Y Actriz");
			}
		this.actor = actor;
		this.actriz = actriz;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getActriz() {
		return actriz;
	}

	public void setActriz(String actriz) {
		this.actriz = actriz;
	}

	@Override
	public String toString() {
		return "Pelicula [" + "titulo=" + getTitulo() + ", autor="
				+ getAutor() + ", formato=" + getFormato() + ", duracion=" + getDuracion() + ", actor=" + actor + ", actriz=" + actriz+ "]";
	}
	
}
