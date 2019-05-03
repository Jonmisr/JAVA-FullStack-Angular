package com.utn.operadorTernario;

import javax.swing.JOptionPane;

public class JugadoresFutbol {

	private String nombre;
	private int edad;
	private int categoria;

	public JugadoresFutbol() {
	}

	public JugadoresFutbol(String nombre, int edad, int categoria) {
		this.nombre = nombre;
		this.edad = edad;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCategoria() {
		return categoria;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	public void solicitarDatosJugador() {

		int edadAuxiliar;
		int categoriaAuxiliar;
		boolean flag = false;
		
		this.nombre = JOptionPane.showInputDialog(null, "Ingrese El Nombre Del Jugador: ", "Jugador",
				JOptionPane.INFORMATION_MESSAGE);
		
		do {

			if(flag) {
				
				edadAuxiliar = Integer.parseInt(JOptionPane.showInputDialog(null, "Edad Invalida, Ingrese La Edad Nuevamente",
						"Jugador", JOptionPane.ERROR_MESSAGE));
				
			}
			
			flag = true;
			
			edadAuxiliar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese La Edad Del Jugador: ",
					"Jugador", JOptionPane.INFORMATION_MESSAGE));

		} while (edadAuxiliar < 18);

		this.edad = edadAuxiliar;
		
		flag = false;
		
		do {
			
			if(flag) {
				
				categoriaAuxiliar = Integer.parseInt(JOptionPane.showInputDialog(null, "Categoria Invalida, Ingresela Nuevamente",
						"Jugador", JOptionPane.ERROR_MESSAGE));				
			}
			
			flag = true;

			categoriaAuxiliar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese La Categoria Del Jugador: ",
					"Jugador", JOptionPane.INFORMATION_MESSAGE));

		} while (categoriaAuxiliar < 1 || categoriaAuxiliar > 3);
		
		this.categoria = categoriaAuxiliar;

	}
	
	@Override
	public String toString() {
		return "JugadoresFutbol [nombre=" + nombre + ", edad=" + edad + ", categoria=" + categoria + "]";
	}

}
