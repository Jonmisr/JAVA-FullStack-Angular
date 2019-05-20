package com.utn.ejerciciosTryCatch;

import java.util.Scanner;

public class AppMain {

	/**
	 * Escribe un programa que juegue con el usuario a adivinar un n�mero. El
	 * ordenador debe generar un n�mero entre 1 y 500, y el usuario tiene que
	 * intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor,
	 * el ordenador debe decirle al usuario si el n�mero que tiene que adivinar es
	 * mayor o menor que el que ha introducido el usuario. Cuando consiga
	 * adivinarlo, debe indic�rselo e imprimir en pantalla el n�mero de veces que el
	 * usuario ha intentado adivinar el n�mero. Si el usuario introduce algo que no
	 * es un n�mero, debe indicarlo en pantalla, y contarlo como un intento.
	 **/

	public static void main(String[] args) {

		boolean variableAdivina = true;
		Scanner scanner = new Scanner(System.in);
		int intentosRealizados;

		do {
			Ordenador juegoCompu = Ordenador.instanciarUnaVez();
			System.out.println("Ingrese Un Valor Del 1 - 500");
			String valorElegido = scanner.next();
			variableAdivina = juegoCompu.adivineElNumero(valorElegido);
			intentosRealizados = juegoCompu.devolverIntentosCantidad();

		} while (variableAdivina != true);

		scanner.close();
		System.out.println("La Cantidad De Intentos Fue De: " + intentosRealizados);

	}

}
