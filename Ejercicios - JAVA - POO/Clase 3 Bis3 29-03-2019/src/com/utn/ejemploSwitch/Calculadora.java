package com.utn.ejemploSwitch;

import java.util.Scanner;

public class Calculadora {

	static int numero1;
	static int numero2;

	public Calculadora() {}

	// Metodo: Conjunto De Instrucciones Que Cumplen Una Tarea
	// Procedimiento: No Retorna Ningun Valor
	// Funcion: Siempre Retorna Un Valor

	// Definicion De Nuestras Propias Funciones
	// Un Metodo Al Hacerlo Estatico Y Sus Variables Tambien
	// Te Permite No Instanciar El Objeto De La Clase Deseada
	// Sino Directamente Invocarla Poniendo Adelante Del Metodo El Nombre De La
	// Clase

	public static int sumar() {

		int resultado;
		resultado = numero1 + numero2;
		return resultado;
	}

	public static int restar() {

		int resultado;
		resultado = numero1 - numero2;
		return resultado;
	}

	public int multiplicar() {

		int resultado;
		resultado = numero1 * numero2;
		return resultado;
	}

	public int dividir() {

		if (numero2 == 0) {

			mostrarError("No Se Puede Dividir Por 0");
			return 0;
		}

		else {

			int resultado;
			resultado = numero1 / numero2;
			return resultado;

		}
	}

	// Defino Metodo - Procedimiento
	public static void mostrarError(String unString) {

		System.err.println(unString);
	}

	public void pedirValores() {

		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("Ingrese El Valor Del Primer Numero: ");
		numero1 = scanner.nextInt();

		System.out.println("Ingrese El Valor Del Segundo Numero: ");
		numero2 = scanner.nextInt();

	}

}
