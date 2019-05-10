package com.utn.herencia;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Pasajero> pasajeros = new ArrayList<>();
		
		Pasajero pasajero2 = new Pasajero(1, "Juan");
		Pasajero pasajero3 = new Pasajero(5, "Nicolas");
		Pasajero pasajero4 = new Pasajero(1, 9, "Raul");
		Pasajero pasajero5 = new Pasajero(4, 6, "Pepe");
		
		pasajeros.add(pasajero2);
		pasajeros.add(pasajero3);
		pasajeros.add(pasajero4);
		pasajeros.add(pasajero5);
		
		VueloCarga vuelo1 = new VueloCarga();
		vuelo1.agregarPaquete(100, 20, 3000);
		
		Pasajero.mostrarListaDePasajeros(pasajeros);
		
		ArrayList<Vuelo> flotas = new ArrayList<>();
		Vuelo flota1 = new Vuelo();
		Vuelo flota2 = new VueloCarga();
		Vuelo flota3 = new Vuelo();
		Vuelo flota4 = new VueloCarga();

		flotas.add(flota1);	
		flotas.add(flota2);
		flotas.add(flota3);
		flotas.add(flota4);
		
		flota1.agregarPasajero(pasajero2);
		flota1.agregarPasajero(pasajero3);
		flota1.agregarPasajero(pasajero4);
		flota1.agregarPasajero(pasajero5);
		
		System.out.println(flotas.get(0).getAsientos());
		System.out.println(flotas.get(1).getAsientos());
		
		ArrayList<Object> objetos = new ArrayList<>();
		Object objeto = new Object();
		
		objetos.add(flota1);
		objetos.add(flota2);
		objetos.add(pasajero2);
		objetos.add(objeto);
		
	}

}
