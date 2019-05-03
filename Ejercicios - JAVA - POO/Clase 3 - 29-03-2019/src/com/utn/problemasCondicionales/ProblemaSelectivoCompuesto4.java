package com.utn.problemasCondicionales;

import java.util.Scanner;

public class ProblemaSelectivoCompuesto4 {
	
	public static void main(String[] args) {
		
		double salarioMensual;
		int antiguedad;
		double utilidad;
		
		Scanner scanner = new Scanner(System.in);
		
		//Ingreso Los Valores De Antigudad y Saldo
		System.out.println("Ingrese El Salario Mensual Del Trabajador: ");
		salarioMensual = scanner.nextDouble();
		
		System.out.println("Ingrese La Antiguedad Del Trabajador: ");
		antiguedad = scanner.nextInt();
		
		//Condicional Compuesto Para Aplicar Determinado Porcentaje
		if (antiguedad < 1) {
			
			utilidad = calculoUtilidadTrabajador(salarioMensual, 0.05);
		}
		  
		else if ((antiguedad >= 1) && (antiguedad < 2)) {
			
			utilidad = calculoUtilidadTrabajador(salarioMensual, 0.07);
		}
		
		else if ((antiguedad >=2) && (antiguedad < 5)) {
			
			utilidad = calculoUtilidadTrabajador(salarioMensual, 0.1);
		}

		else if ((antiguedad >= 5) && (antiguedad < 10)) {
			
			utilidad = calculoUtilidadTrabajador(salarioMensual, 0.15);
		}
		
		else {
			
			utilidad = calculoUtilidadTrabajador(salarioMensual, 0.2);
		}
		
		System.out.println("La Utilidad Del Trabajador Es De: $" + utilidad);
		scanner.close();
	}

	//Metodo Para El Calculo De La Utilidad
public static double calculoUtilidadTrabajador(double salario, double porcentajeAntiguedad) {
		
		return salario * porcentajeAntiguedad;
	}

}
