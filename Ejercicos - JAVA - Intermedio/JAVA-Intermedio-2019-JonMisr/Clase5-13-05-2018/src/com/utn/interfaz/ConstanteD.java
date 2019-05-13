package com.utn.interfaz;

public class ConstanteD implements IConstante {

	int numeros[] = new int[MAX];

	public void metodoConstante() {

		for (int i = MIN; i < 11; i++) {
			if (i >= MAX) {
				System.out.println(MENSAJERROR);
			}
			else {
				numeros[i] = i;
				System.out.println(numeros[i] + " ");
			}
		}

	}
}
