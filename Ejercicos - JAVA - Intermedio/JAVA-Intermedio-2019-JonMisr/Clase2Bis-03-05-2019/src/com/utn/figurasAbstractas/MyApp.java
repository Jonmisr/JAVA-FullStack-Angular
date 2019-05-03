package com.utn.figurasAbstractas;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		
		String colorDelCuadrado;
		double ladoCuadrado;
		
		String colorDelTriangulo;
		double baseTriangulo;
		double alturaTriangulo;
		
		String colorDelCirculo;
		double radioCirculo;
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Ingrese El Lado Del Cuadrado ");
		ladoCuadrado = teclado.nextDouble();
		System.out.println("Ingrese El Color Del Cuadrado ");
		colorDelCuadrado = teclado.next();

		Cuadrado cuadrado = new Cuadrado(colorDelCuadrado, ladoCuadrado);
		
		System.out.printf("El Area Del Cuadrado %s Es: %f.0\n", cuadrado.getColor(), cuadrado.calcularAreaFigura());
		
		System.out.println("Ingrese La Base Del Triangulo ");
		baseTriangulo = teclado.nextDouble();
		System.out.println("Ingrese La Altura Del Triangulo ");
		alturaTriangulo = teclado.nextDouble();
		System.out.println("Ingrese El Color Del Triangulo ");
		colorDelTriangulo = teclado.next();

		Triangulo triangulo = new Triangulo(colorDelTriangulo, baseTriangulo, alturaTriangulo);
		
		System.out.printf("El Area Del Triangulo %s Es: %f.0\n", triangulo.getColor(), triangulo.calcularAreaFigura());
		
		System.out.println("Ingrese El Radio Del Circulo ");
		radioCirculo = teclado.nextDouble();
		System.out.println("Ingrese El Color Del Circulo ");
		colorDelCirculo = teclado.next();
		
		Circulo circulo = new Circulo(colorDelCirculo, radioCirculo);
		
		System.out.printf("El Area Del Circulo %s Es: %.0f\n", circulo.getColor(), circulo.calcularAreaFigura());
		
		teclado.close();
	}

}
