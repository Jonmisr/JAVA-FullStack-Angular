package com.utn.rethrow;

public class Rethrow {

	/** Una Excepcion Capturada Por Un Try Catch, Se Puede Volver A Lanzar Para Que Pueda 
	 * Ser Capturada Por Otro Try Catch Externo. 
	 * Asi Permitimos De Esta Manera, Acceso Multiple, A Otros Manejadores De La Excepcion*/
	
	public static void generoException() {
		
		int numerador[] = {2,4,8,16,32,64,128,256,512,1024};
		int denominador[] = {2,0,6,4,0,7};

		for (int i = 0; i < numerador.length; i++) {
			
			try {
				
				System.out.println(numerador[i] + "/" + denominador[i] + " = " + (numerador[i] / denominador[i]));	
				
			} catch (ArithmeticException exc) {
				
				System.out.println("No Se Puede Dividir Por Cero En Los Numeros Reales");
				
			} catch (ArrayIndexOutOfBoundsException exc) {
				
				System.out.println("No Se Pudo Encontrar Elemento En El Array");
				throw exc;
				
			}
		}
	
	}
	
}
