package com.utn.sobreCargaMetodos;

import java.util.Calendar;

public class Fecha {

	private int dia,mes,anio;
	
	public Fecha(){}
	
	public Fecha(int dia, int mes, int anio) {
		
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		if(!fechaCorrecta()) { asignarFecha(); 
							   this.mes++;}	
	
	}
	
	//SobreCarga De Metodos
	//Primer Metodo
	
	public void asignarFecha() {	
		//Este Metodo Asigna La Fecha Del Sistema
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaDelSistema.get(Calendar.MONTH));
		setAnio(fechaDelSistema.get(Calendar.YEAR));
		this.mes++;
	}
	
	//Primer Metodo SobreCargado
	public void asignarFecha(int dia) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(dia);
		setMes(fechaDelSistema.get(Calendar.MONTH));
		setAnio(fechaDelSistema.get(Calendar.YEAR));	
		this.mes++;
	}
	
	//Segundo Metodo SobreCargado
	public void asignarFecha(int dia, int mes) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(dia);
		setMes(mes);
		setAnio(fechaDelSistema.get(Calendar.YEAR));		
	}
	
	//Tercer Metodo SobreCargado
	public void asignarFecha(int dia, int mes, int anio) {
		setDia(dia);
		setMes(mes);
		setAnio(anio);		
	}
	
	private boolean esBisiesto() {	
		
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
	}
	
	public boolean fechaCorrecta() {
		
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		
		anioCorrecto = anio > 0;
		mesCorrecto = (mes >= 1) && (mes <=12);
		
		switch(mes) {
		
		case 2: 
				 if (esBisiesto()) {
				 diaCorrecto = (dia >= 1) && (dia <= 29);
								  }
			
				 else { diaCorrecto = (dia >= 1) && (dia <= 28); }
		 		 break;
		 	
		case 4:  diaCorrecto = (dia >= 1) && (dia <= 30);
				 break;
			
		case 6:  diaCorrecto = (dia >= 1) && (dia <= 30);
				 break;
		
		case 9:  diaCorrecto = (dia >= 1) && (dia <= 30);
				 break;
		
		case 11: diaCorrecto = (dia >= 1) && (dia <= 30);
				 break;
				
		default: diaCorrecto = (dia >= 1) && (dia <= 31);
				 break;
		}
		
		return (diaCorrecto) && (mesCorrecto) && (anioCorrecto);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}
	
}
