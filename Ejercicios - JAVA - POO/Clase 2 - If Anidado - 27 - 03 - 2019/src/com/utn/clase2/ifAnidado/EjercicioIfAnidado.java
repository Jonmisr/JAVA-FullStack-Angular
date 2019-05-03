package com.utn.clase2.ifAnidado;

import java.util.Scanner;

public class EjercicioIfAnidado {

	public static void main(String[] args) {

		int nota1 = 0;
		int nota2 = 0;
		int nota3 = 0;
		int mayor;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese Nota 1: ");
		nota1 = scanner.nextInt();
		
		System.out.println("Ingrese Nota 2: ");
		nota2 = scanner.nextInt();
		
		System.out.println("Ingrese Nota 3: ");
		nota3 = scanner.nextInt();
		
		if((nota1 > nota2) && (nota1 > nota3)) {
			
			mayor = nota1;
			
		}
		
		else if((nota2 > nota3) && (nota2 > nota1)) { 

			mayor = nota2;
				
	}		
		
		else {
			
			mayor = nota3;
				
		}	
		
		System.out.println( mayor + " - Es La Mayor Nota");
		scanner.close();
		
		}

}
