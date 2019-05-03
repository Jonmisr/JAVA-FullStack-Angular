package com.utn.clase2bis.sentenciaIF;

import java.util.Scanner;

public class Ejercicio2IfElse {

	public static void main(String[] args) {

		int horasTrabajadas;
		int horasExtras;
		int horasExactasTrabajadas = 40;
		float salarioSemanal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese Las Horas Trabajadas:");
		horasTrabajadas = scanner.nextInt();		
		
		if (horasTrabajadas <= 40) {
			
			salarioSemanal = 16 * horasTrabajadas;
			
			System.out.println("El Salario Semanal Es De: " + salarioSemanal);
		}
			
		else {
				
			horasExtras =  horasTrabajadas - 40;
			salarioSemanal =  16 * horasExactasTrabajadas + 20 * horasExtras;
			
			System.out.println("El Salario Semanal Es De: " + salarioSemanal);
			
		}
		}
	}


