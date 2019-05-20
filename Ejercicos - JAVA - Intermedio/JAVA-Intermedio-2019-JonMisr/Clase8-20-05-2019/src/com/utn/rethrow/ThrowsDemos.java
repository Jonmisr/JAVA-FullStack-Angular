package com.utn.rethrow;

import java.io.IOException;

public class ThrowsDemos {

	/**En Algunos Casos, Si Un Metodo Genera Una Excepcion Que No Maneja,
	 * Debe Declarar Esa Excepcion En Una Clausula Throws.
	 */
	
	
	public static int prompt(String args) throws ArithmeticException, IOException{
		
		System.out.println(args + " : ");
		
		int numero = System.in.read();	
		int resultado = numero / 0;
		
		return resultado;
	}
}
