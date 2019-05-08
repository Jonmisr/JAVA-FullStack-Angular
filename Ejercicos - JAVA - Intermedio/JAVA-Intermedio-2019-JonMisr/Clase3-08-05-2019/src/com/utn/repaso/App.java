package com.utn.repaso;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Pasajero> pasajeros = new ArrayList<>();
		
		Pasajero pasajero1 = new Pasajero();
		Pasajero pasajero2 = new Pasajero(5);
		Pasajero pasajero3 = new Pasajero(1);
		Pasajero pasajero4 = new Pasajero(8,5);
		
		pasajeros.add(pasajero1);
		pasajeros.add(pasajero2);
		pasajeros.add(pasajero3);
		pasajeros.add(pasajero4);
		
		for(Pasajero unPasajero: pasajeros) {		
			System.out.println(unPasajero.toString());
		}
		
	}

}
