package com.utn.mvc.demo;

import com.utn.mvc.controller.ClienteControlador;
import com.utn.mvc.model.ClienteModelo;
import com.utn.mvc.view.ClienteVista;

public class AppMain {

	public static void main(String[] args) {
		
		ClienteVista unaVista = new ClienteVista();
		ClienteModelo unCliente = llenarDatosCliente();
		ClienteControlador unControlador = new ClienteControlador(unCliente, unaVista);
		
		unControlador.actualizarVista();
		
		unControlador.setNombre("Julian");
		unControlador.setApellido("Rodriguez");
		unControlador.setDni(38555778);
		unControlador.setId(12366);
		System.out.println();
		unControlador.actualizarVista();
		
	}

	//Metodo Estatico Que Retorna El Cliente Con Todos Sus Datos
	private static ClienteModelo llenarDatosCliente() {
		
		ClienteModelo nuevoCliente = new ClienteModelo();
		
		nuevoCliente.setApellido("Misrahi");
		nuevoCliente.setDni(39625838);
		nuevoCliente.setNombre("Jonathan");
		nuevoCliente.setId(10258);
		
		return nuevoCliente;
		
	}
}
