package com.utn.mvc.controller;

import com.utn.mvc.model.ClienteModelo;
import com.utn.mvc.view.ClienteVista;

public class ClienteControlador {

	//Instanciamos Objetos De La Vista Y Del Modelo
	private ClienteModelo modelo;
	private ClienteVista vista;
	
	//Contructor Para Inicializar El Modelo Y La Vista
	
	public ClienteControlador() {}
	
	public ClienteControlador(ClienteModelo model, ClienteVista view) {
		this.modelo = model;
		this.vista = view;
	}

	//Getter Y Setter Modelo
	public int getId() {
		return modelo.getId();
	}
	
	public void setId(int id) {
		this.modelo.setId(id);
	}
	
	public int getDni() {
		return modelo.getDni();
	}
	
	public void setDni(int dni) {
		this.modelo.setDni(dni);
	}
	
	public String getNombre() {
		return modelo.getNombre();
	}
	
	public void setNombre(String nombre) {
		this.modelo.setNombre(nombre);
	}
	
	public String getApellid() {
		return modelo.getApellido();
	}
	
	public void setApellido(String apellido) {
		this.modelo.setApellido(apellido);
	}
	
	public void actualizarVista() {
		vista.imprimirDatos(modelo.getId(), modelo.getNombre(), modelo.getApellido(), modelo.getDni());
	}
}
