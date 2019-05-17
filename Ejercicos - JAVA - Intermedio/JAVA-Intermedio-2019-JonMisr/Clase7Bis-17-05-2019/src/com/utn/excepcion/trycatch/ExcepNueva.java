package com.utn.excepcion.trycatch;

public class ExcepNueva {

	public static void forzarException() {
		
		int nums[] = new int[4];
		
		System.out.println("Antes Del Error De Array");
		
		nums[12] = 23;
		
		System.out.println("Paso Sin Problemas");
	}
	
}
