package com.utn.dojo;

import java.util.ArrayList;

public class Appmain {

	public static void main(String[] args) {
		
		ArrayList<Pizza> microOndas = new ArrayList<>();
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		
		microOndas.add(pizza1);
		microOndas.add(pizza2);
		
		for(Pizza unaPizza: microOndas) {
			
			unaPizza.determinacionDePizza();
			
		}

		System.out.println("La Cantidad De Pizzas: " + microOndas.size());
		
		for(Pizza unaPizza : microOndas) {
			
			unaPizza.acumuladorDeIngredientes();
			System.out.println("Nombre Pizza: " + unaPizza.getTipoPizza());
			unaPizza.recorrerListaIngredientes();
		}
		
		
	}

}
