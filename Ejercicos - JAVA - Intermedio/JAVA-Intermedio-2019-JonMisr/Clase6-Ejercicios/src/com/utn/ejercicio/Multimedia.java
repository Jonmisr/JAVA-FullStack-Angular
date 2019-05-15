package com.utn.ejercicio;

public class Multimedia {

	private String titulo;
	private String autor;
	private Formato formato;
	private String duracion;
	
	public Multimedia() {}
	
	public Multimedia(String titulo, String autor, Formato formato, String duracion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.formato = formato;
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public Formato getFormato() {
		return formato;
	}

	public String getDuracion() {
		return duracion;
	}

	@Override
	public String toString() {
		return "Multimedia [titulo=" + titulo + ", autor=" + autor + ", formato=" + formato + ", duracion=" + duracion
				+ "]";
	}
	
	public boolean equals(Multimedia unMultimedia) {

		return this.getTitulo().contains(unMultimedia.getTitulo()) && this.getAutor().contains(unMultimedia.getAutor());
	}
	
}
