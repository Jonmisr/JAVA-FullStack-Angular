package com.utn.dojo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Pizza {

	private ArrayList<String> ingredientes = new ArrayList<>();
	private int tiempoDeCoccion;
	private String tipoPizza;
	private boolean flag = false;

	int contadorMuzza = 0;
	int contadorTomate = 0;
	int contadorProvolone = 0;
	int contadorJamon = 0;
	int contadorAcelga = 0;
	int contadorQueso = 0;
	int contadorSalsa = 0;

	public Pizza() {
	}

	public Pizza(ArrayList<String> ingredientes, String tipoPizza) {
		super();
		this.ingredientes = ingredientes;
		this.tipoPizza = tipoPizza;
	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTipoPizza() {
		return tipoPizza;

	}

	public void setTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public int getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}

	public void setTiempoDeCoccion(int tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}

	public void determinacionDePizza() {

		this.tiempoDeCoccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Un Tiempo De Coccion",
				"Tiempo", JOptionPane.INFORMATION_MESSAGE));

		do {

			if (flag) {

				JOptionPane.showMessageDialog(null, "Ingreso Un Tiempo De Coccion Invalido", "Pizza",
						JOptionPane.ERROR_MESSAGE);

			}

			flag = true;

			this.tipoDeCoccion(tiempoDeCoccion);

		} while ((tiempoDeCoccion != 5) && (tiempoDeCoccion != 10) && (tiempoDeCoccion != 15));
	}

	public void recorrerListaIngredientes() {

		for (String unIngrediente : ingredientes) {

			System.out.println("Los Ingredientes Son: " + unIngrediente);
		}
	}

	public void tipoDeCoccion(int tiempoDeCoccion) {

		if (tiempoDeCoccion == 5) {

			this.tipoPizza = "grande de Muza";
			ingredientes.add("mozzarella");
			ingredientes.add("tomate");
		}

		else if (tiempoDeCoccion == 10) {

			this.tipoPizza = "Doble queso con jamón";
			ingredientes.add("mozarrella");
			ingredientes.add("provolone");
			ingredientes.add("tomate");
			ingredientes.add("jamon");
		}

		else if (tiempoDeCoccion == 15) {

			this.tipoPizza = "la vegetariana";
			ingredientes.add("acelga");
			ingredientes.add("mozarrella");
			ingredientes.add("salsa blanca");
			ingredientes.add("queso rayado");
		}
	}

	public void acumuladorDeIngredientes() {

		for (String unIngrediente : ingredientes) {

			if (unIngrediente == "mozzarella") {

				contadorMuzza += 1;
			}

			else if (unIngrediente == "tomate") {

				contadorTomate += 1;
			}

			else if (unIngrediente == "provolone") {

				contadorProvolone += 1;
			}
			
			else if (unIngrediente == "jamón") {

				contadorJamon += 1;
			}
			
			else if (unIngrediente == "acelga") {

				contadorAcelga += 1;
			}
			
			else if (unIngrediente == "salsa blanca") {

				contadorSalsa += 1;
			}
			
			else if (unIngrediente == "queso rayado") {

				contadorQueso += 1;
			}
		}

	}
}
