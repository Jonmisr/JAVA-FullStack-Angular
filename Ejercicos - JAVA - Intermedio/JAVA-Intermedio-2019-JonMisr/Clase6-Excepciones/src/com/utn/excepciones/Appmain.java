package com.utn.excepciones;

public class Appmain {

	public static void main(String[] args) {
		
		int[] array = new int [20];
		
		try {
			
			array[-3] = 24;
			
			
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Error De Indice De Array: " + e.getMessage());
		}
		

	}

}
