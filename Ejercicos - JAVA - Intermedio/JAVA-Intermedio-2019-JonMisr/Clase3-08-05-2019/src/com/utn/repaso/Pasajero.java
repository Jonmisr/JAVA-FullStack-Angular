package com.utn.repaso;

public class Pasajero {

	private int maletas;
	private int maletasPagas;
	private double tarifaPorMaleta;
	private int totalDeEquipaje;
	private double totalAPagar;
	
	public Pasajero() {}
	
	public Pasajero(int maletas) {
		
		this(maletas > 3 ? 25.0d : 50.0d);
		totalDeEquipaje = maletas;
		totalAPagar = totalDeEquipaje * tarifaPorMaleta;
	}
	
	public Pasajero(int maletas, int maletasPagas) {
		
		this(maletas);
		this.maletas = maletas;
		this.maletasPagas = maletasPagas;
		totalDeEquipaje = maletas + maletasPagas;
		totalAPagar = maletas * tarifaPorMaleta;
	}
	
	private Pasajero(double tarifaPorMaleta) {
		
		this.tarifaPorMaleta = tarifaPorMaleta;
	}
	
	public int getMaletas() {
		return maletas;
	}

	public void setMaletas(int maletas) {
		this.maletas = maletas;
	}

	public int getMaletasPagas() {
		return maletasPagas;
	}

	public void setMaletasPagas(int maletasPagas) {
		this.maletasPagas = maletasPagas;
	}

	public double getTarifaPorMaleta() {
		return tarifaPorMaleta;
	}

	public void setTarifaPorMaleta(double tarifaPorMaleta) {
		this.tarifaPorMaleta = tarifaPorMaleta;
	}

	public int getTotalDeEquipaje() {
		return totalDeEquipaje;
	}

	public void setTotalDeEquipaje(int totalDeEquipaje) {
		this.totalDeEquipaje = totalDeEquipaje;
	}

	public double getTotalAPagar() {
		return totalAPagar;
	}

	public void setTotalAPagar(double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	@Override
	public String toString() {
		return "Pasajero [maletas=" + maletas + ", maletasPagas=" + maletasPagas + ", tarifaPorMaleta="
				+ tarifaPorMaleta + ", totalDeEquipaje=" + totalDeEquipaje + ", totalAPagar=" + totalAPagar + "]";
	}
	

}
