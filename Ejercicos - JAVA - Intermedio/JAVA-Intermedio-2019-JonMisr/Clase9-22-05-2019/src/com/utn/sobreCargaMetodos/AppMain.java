package com.utn.sobreCargaMetodos;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		
		int anio, mes, dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Dia: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Mes: "));
		anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Anio: "));
		
		Fecha unaFecha = new Fecha(dia, mes, anio);	
		System.out.println(unaFecha.toString());
		
		Fecha unaFecha2 = new Fecha();	
		unaFecha2.asignarFecha(30);	
		System.out.println(unaFecha2.toString());
		
		Fecha unaFecha3 = new Fecha();	
		unaFecha3.asignarFecha(15, 5);	
		System.out.println(unaFecha3.toString());
		
		Fecha unaFecha4 = new Fecha();	
		unaFecha4.asignarFecha(18, 6, 1996);
		System.out.println(unaFecha4.toString());		
	}
}
