package com.utn.herencia;

public abstract class Vuelo {

	public int numeroVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;

	// Inicializador De Bloque
	{
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsientos(); i++) {
			asientosDisponibles[i] = true;
		}
	}

	public Vuelo() {
	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numeroDeVuelo) {
		this.numeroVuelo = numeroDeVuelo;
	}

	public void agregarPasajero(Pasajero unPasajero) {

		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println("Ya Se Encuentra En El Vuelo: " + unPasajero.getName());
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		return pasajeros < getAsientos();
	}

	private void faltaAsiento() {
		System.out.println("Ya No Quedan Asientos, Busque Otra Linea");
	}

	public int getAsientos() {
		return getAsiento();
	}

	public int getAsiento() {
		return 150;
	}
}
