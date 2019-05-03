package com.utn.ejemploSwitch;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {

		System.out.println("Menu Principal De Operaciones Matematicas Switch");
		Scanner scanner = new Scanner(System.in);
		
		//Instanciar Un Objeto De Una Clase Tipo Calculadora
		Calculadora calculador = new Calculadora();

		String opcion = "";	

		do {

			System.out.println("Ingresa Tu Operacion Matematica: SUMA, RESTA, MULTIPLICACION, DIVISION ");
			opcion = scanner.next().toUpperCase();

			if (!"SALIR".equals(opcion)) {

				//calculador.pedirValores();

				switch (opcion) {

				case "SUMA":

					calculador.pedirValores();
					System.out.println("El Resultado De La Suma Es: " + Calculadora.sumar());
					break;

				case "RESTA":

					calculador.pedirValores();
					System.out.println("El Resultado De La Resta Es: " + Calculadora.restar());
					break;

				case "MULTIPLICACION":

					calculador.pedirValores();
					System.out.println("El Resultado De Multiplicar Es: " + calculador.multiplicar());
					break;

				case "DIVISION":

					calculador.pedirValores();
					System.out.println("El Resultado De La Division Es: " + calculador.dividir());
					break;

				default:
					
					Calculadora.mostrarError("Opcion Incorrecta");
					break;

				}
			}

		} while (!"SALIR".equals(opcion));

		scanner.close();
	}

}
