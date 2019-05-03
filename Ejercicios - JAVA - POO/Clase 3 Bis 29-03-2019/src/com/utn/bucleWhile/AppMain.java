package com.utn.bucleWhile;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AppMain {

	//Realizar un algoritmo que permita realizar N veces lo siguiente:
	//Ingresar 2 numeros, calcular su suma e informar el resultado
	
	public static void main(String[] args) {

		int numero1, numero2, resultado;
		int flag = 1;		
		
		Scanner scanner = new Scanner(System.in);
		
		while(flag == 1) {
			
			//System.out.println("Ingrese El Primer Numero: ");
			//numero1 = scanner.nextInt();
			
			//System.out.println("Ingrese El Primer Numero: ");
			//numero2 = scanner.nextInt();
			
			numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 1: "));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero 2: "));
			
			resultado = numero1 + numero2;
			
			//System.out.println("El Resultado De La Suma Entre: " + numero1 + " y " + numero2 + " es: " + resultado);
			JOptionPane.showMessageDialog(null, "El Resultado De La Suma Entre: " + numero1 + " y " + numero2 + " es: " + resultado);
			
			//System.out.println("Desea Continuar Haciendo Mas Calculos? ");
			//System.out.println("De No Ser Asi, Ingrese Un Numero Que Corte El Bucle: ");
			
			flag = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero Que Corte Bucle: "));			
			//flag = scanner.nextInt();
			
		}
		
		scanner.close();
	}

}
