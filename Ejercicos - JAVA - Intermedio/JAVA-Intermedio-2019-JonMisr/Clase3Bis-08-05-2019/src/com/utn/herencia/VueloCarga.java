package com.utn.herencia;

public class VueloCarga extends Vuelo {

	public int asientos = 12;
	public float espacioMaximoDeCarga = 2500000;
	public float espacioDeCargaUsado;

	public VueloCarga() {
		super();
	}
	
	public void agregarPaquete(float altura, float ancho, float profundidad) {

		double size = altura * ancho * profundidad;

		if (espacioDeCargaDisponible(size))
			espacioDeCargaUsado += size;
		else
			faltaEspacio(size);

	}

	private void faltaEspacio(double size) {
		System.err.println("No Se Pudo Agregar " + size + ", Supera el Espacio Maximo " + this.getEspacioMaximoDeCarga());
	}

	private boolean espacioDeCargaDisponible(double tamanio) {
		return espacioDeCargaUsado + tamanio <= espacioMaximoDeCarga;
	}

	@Override
	public int getAsiento() {
		return 12;
	}

	public int getAsientos() {
		return asientos;
	}

	public float getEspacioMaximoDeCarga() {
		return espacioMaximoDeCarga;
	}

	public float getEspacioDeCargaUsado() {
		return espacioDeCargaUsado;
	}
	
	
}
