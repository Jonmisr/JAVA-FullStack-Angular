package com.utn.herencia;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Pasajero> pasajeros = new ArrayList<>();
		
		Pasajero pasajero1 = new Pasajero();
		Pasajero pasajero2 = new Pasajero(1);
		Pasajero pasajero3 = new Pasajero(5);
		Pasajero pasajero4 = new Pasajero(1, 9);
		Pasajero pasajero5 = new Pasajero(4, 6);
		
		pasajeros.add(pasajero1);
		pasajeros.add(pasajero2);
		pasajeros.add(pasajero3);
		pasajeros.add(pasajero4);
		pasajeros.add(pasajero5);
		
		VueloCarga vuelo1 = new VueloCarga();
		vuelo1.agregarPaquete(10, 20, 300);
		System.out.println(vuelo1.getEspacioDeCargaUsado());
		
		for(Pasajero unPasajero: pasajeros) {
		System.out.println(unPasajero.toString());
		}
	}

}
