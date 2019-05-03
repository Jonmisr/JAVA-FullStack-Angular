package com.utn.clase2.sentenciaIF;

import java.util.Scanner;
import java.lang.String;

public class EjercicioIfElse {

	
	public static void main(String[] args) {

		//Declaramos Las Variables
		
		int nota1;
		int nota2;
		int nota3;
		float promedio;
		String respuesta;
		
		//Declaramos El Scanner Para Ingresar Valores
		
		Scanner scanner = new Scanner(System.in);
		
		//Se Ingresan Los Valores
		System.out.println("Ingrese La Primer Nota");
		nota1 = scanner.nextInt();
		System.out.println("Ingrese La Segunda Nota");
		nota2 = scanner.nextInt();
		System.out.println("Ingrese La Tercer Nota");
		nota3 = scanner.nextInt();
	
		System.out.println("Nota 1 : " + nota1  +  " Nota 2 : " + nota2 + " Nota 3 : " + nota3);
		
		//Cálculo Del Promedio
		promedio = (nota1 + nota2 + nota3) / 3 ;
		
		if (promedio >= 7) {
			
			System.out.println("Aprobó, Su Promedio Fue: " + promedio);
			
		}
		
		else {
			
			System.out.println("Reprobó, Su Promedio Fue: " + promedio);
			
		}				
	
}
}
