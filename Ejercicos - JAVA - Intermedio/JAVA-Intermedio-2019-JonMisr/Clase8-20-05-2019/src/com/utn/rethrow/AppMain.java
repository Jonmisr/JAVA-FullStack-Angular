package com.utn.rethrow;

import java.io.IOException;

public class AppMain {

	public static void main(String[] args) {

//		try {
//
//			Rethrow.generoException();
//
//		} catch (ArrayIndexOutOfBoundsException exc) {
//
//			System.out.println("Error - Capturado En El Main - Fin Del Programa");
//
//		}
//
//		for(int i = 0; i < 3; i++) {		
//			UseDeFinally.generoError(i);
//			System.out.println("Estoy En El Main");
//		}
		
		
		int p;
		
		try {
			
			//Dado Que Prompt() Podria Arrojar Una Excepcion, Toda Llamada A Este Metodo Debera Estar
			//Dentro De Un Bloque Try		
			p = ThrowsDemos.prompt("Ingresar Un Numero");
			
		} catch (ArithmeticException | IOException e) {
			System.out.println("Ocurrio Una Excepcion De Arithmetic");
			p = '0';
			e.printStackTrace();
			
		} 
		
		System.out.println("Usted Presiono La Tecla: " + p);
	}

}
