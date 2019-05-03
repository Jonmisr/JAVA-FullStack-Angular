package com.utn.claseAbstracta;

import java.util.ArrayList;

public class MyApp {

	public static void main(String[] args) {

		Instrumento primerInstrumento = new Guitarra();
		Instrumento segundoInstrumento = new Violin();
		Instrumento tercerInstrumento = new Piano();
		ArrayList<Instrumento> instrumentos = new ArrayList<>();

		instrumentos.add(primerInstrumento);
		instrumentos.add(segundoInstrumento);
		instrumentos.add(tercerInstrumento);

		for (Instrumento unInstrumento : instrumentos) {

			System.out.println("Instrumento: " + unInstrumento.tipo);
			unInstrumento.tocar();
		}

//		System.out.println("Instrumento: " + primerInstrumento.tipo);
//		primerInstrumento.tocar();
//		System.out.println("Instrumento: " + segundoInstrumento.tipo);
//		segundoInstrumento.tocar();
//		System.out.println("Instrumento: " + tercerInstrumento.tipo);
//		tercerInstrumento.tocar();
//		System.out.println("Instrumento: " + cuartoInstrumento.tipo);
//		cuartoInstrumento.tocar();

	}

}
