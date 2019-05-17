package com.utn.excepcion.trycatch;

//try anidado
public class App {
	
	public static void main(String[] args) {
		
		int num[] = {1,4,6,8,9,234,256,512} ;
		int denominador[] = {2,0,6,4,0,8} ;
		
	try {
		
		for(int i = 0; i < num.length; i++) {
			
			try {
				System.out.println(num[i] + "/" + denominador[i] + " Es " + (num[i] / denominador[i]));

			}catch (ArithmeticException e) {
				
				System.out.println("No Se Puede Dividir Por: " + denominador[i]);
			}
			
		}
	} catch (ArrayIndexOutOfBoundsException e) {
		
		System.out.println("Ocurrio Un Error");
		System.out.println("Posicion Fuera De Rango");
		
	}
	
	}
	
}
