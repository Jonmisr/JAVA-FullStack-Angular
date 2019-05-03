package com.utn.fooCorp;

import javax.swing.JOptionPane;

public class FooCorporation {

	private static int MINIMOSALDO = 160;
	private static int HORASPRINCIPALES = 40;
	private static int MAXHORAS = 60;
	private static float EXHORAS = 1.5f;

	private int horasTrabajadas;
	private int horasExtras;
	private float saldoTotal;
	private float saldoBase;

	public FooCorporation() {}

	public FooCorporation(int horasTrabajadas, float saldoBase) {
		this.horasTrabajadas = horasTrabajadas;
		this.saldoBase = saldoBase;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public float getSaldoBase() {
		return saldoBase;
	}

	public void setSaldoBase(float saldoBase) {
		this.saldoBase = saldoBase;
	}
	
	@Override
	public String toString() {
		return "FooCorporation [horasTrabajadas=" + horasTrabajadas + ", saldoBase=" + saldoBase + "]";
	}

	public void ingresarValoresDelEmpleado() {

		this.horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Las Horas Trabajadas: ", "Trabajo", JOptionPane.INFORMATION_MESSAGE));
		
		this.horasTrabajadasSuperanLasSesenta(horasTrabajadas);
		
		this.saldoBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese El Saldo Base Por Hora", "Trabajo", JOptionPane.INFORMATION_MESSAGE));
	
		this.valorBaseMayorAlIndicado(saldoBase);
	}

	public float horasTrabajadasHastaCuarenta(float saldoBase) {

		return HORASPRINCIPALES * saldoBase;
	}

	public void saldoEnTotal(int horasTrabajadas, float saldoBase) {	

		if (horasTrabajadas > 40) {

			horasExtras = horasTrabajadas - HORASPRINCIPALES;

			saldoTotal = horasExtras * EXHORAS * saldoBase + horasTrabajadasHastaCuarenta(saldoBase);

		}

		else {

			saldoTotal = horasTrabajadasHastaCuarenta(saldoBase);

		}

		System.out.println("El Saldo Total Fue De: " + saldoTotal);
	}

	public void horasTrabajadasSuperanLasSesenta(int horasTrabajadas) {

		if (horasTrabajadas > MAXHORAS) {

			JOptionPane.showConfirmDialog(null, "“No puede trabajar más de 60 horas semanales", "Trabajo",
					JOptionPane.ERROR_MESSAGE);

		}
	}

	public void valorBaseMayorAlIndicado(float saldoBase) {

		if (saldoBase < MINIMOSALDO) {

			JOptionPane.showConfirmDialog(null, "No puede tener como valor base siendo menor a 160", "Trabajo",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}
