package com.utn.herencia;

import java.util.ArrayList;

public class Pasajero {
	
	private int bolsos;
	private int bolsosPagos;
	private double tarifaPorBolso;
	private double totalAPagar;
	private int totalEquipaje;
	private String name;
	
	public Pasajero() {}
	
	public Pasajero(int bolsos) {
		
		this(bolsos > 2 ? 25.0d : 50.0d);
		this.bolsos = bolsos;
		totalAPagar = bolsos* tarifaPorBolso;
		totalEquipaje = bolsos;
	}

	public Pasajero(int bolsos, int bolsosPagos) {
		this(bolsos);
		this.bolsosPagos = bolsosPagos;
		totalEquipaje = bolsos + bolsosPagos;
		totalAPagar = bolsos * tarifaPorBolso;
	}
	
	private Pasajero(double tarifaPorBolso) {
		this.tarifaPorBolso = tarifaPorBolso;
	}

	public int getBolsos() {
		return bolsos;
	}

	public int getBolsosPagos() {
		return bolsosPagos;
	}

	public double getTarifaPorBolso() {
		return tarifaPorBolso;
	}

	public double getTotalAPagar() {
		return totalAPagar;
	}

	public int getTotalEquipaje() {
		return totalEquipaje;
	}
	
	public static void mostrarListaDePasajeros(ArrayList<Pasajero> pasajeros) {
		for(Pasajero unPasajero : pasajeros) {
			System.out.println(unPasajero.toString());
		}
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Pasajero [bolsos=" + bolsos + ", bolsosPagos=" + bolsosPagos + ", tarifaPorBolso=" + tarifaPorBolso
				+ ", totalAPagar=" + totalAPagar + ", totalEquipaje=" + totalEquipaje + ", name=" + name + "]";
	}	
}
