package com.utn.clase2bis2.sentenciaFOR;

import java.util.Scanner;

public class EjercicioFor {

	public static void main(String[] args) {
		
		float notaPromedio;
		int notaEntrante;
		int totalNotas = 0;
		int cantidadNotas = 7;
		
		Scanner scanner = new Scanner (System.in);
		
		for(int i = 0 ; i < 7; i++) {		
		
		System.out.println("Ingrese La Nota " + (i + 1) +  " del Alumno: ");	
		
		notaEntrante = scanner.nextInt();
		
		totalNotas += notaEntrante;
		
		}
		
		notaPromedio = totalNotas / cantidadNotas;
		
		System.out.println("La Nota Promedio Del Alumno Fue: " + notaPromedio);
		
		scanner.close();
	}
	


}
