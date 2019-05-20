package com.utn.rethrow;

public class UseDeFinally {

	public static void generoError(int rec) {
		
		int t;
		int nums[] = new int[2];

		System.out.println("Recibiendo = " + rec);
		
		try {
			
			switch (rec) {
			
			case 0:
				t = 10 / rec;
				break;
				
			case 1:
				
				nums[4] = 4;
				break;
				
			case 2:
				return;
			}
			
		} catch (ArithmeticException e) {
			
			System.out.println("No Se Puede Dividir Por Cero");
			return;
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Elemento No Encontrado En El Array");
		} 
		
		finally {
			
			//Esto Se Ejecutara Al Salir De Los Bloques Try/Catch
			System.out.println("Estoy Saliendo Del Try");
		}
	}
	
}
