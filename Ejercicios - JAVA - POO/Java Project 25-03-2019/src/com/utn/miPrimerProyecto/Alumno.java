package com.utn.miPrimerProyecto;

import java.util.Date;

public class Alumno {

	private String nombre;
	private String apellido;
	private int legajo;
	private Date fechaDeIngreso;
	
	public Alumno (String nombre, String apellido, int legajo, Date fechaIngreso) {
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setLegajo(legajo);
		this.setFechaDeIngreso(fechaIngreso);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
}
