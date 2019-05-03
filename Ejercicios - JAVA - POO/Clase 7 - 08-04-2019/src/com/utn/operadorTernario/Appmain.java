package com.utn.operadorTernario;

import java.util.ArrayList;

public class Appmain {

	public static void main(String[] args) {

//		int var1 = 10;
//		int var2 = 15;
//		int resultado;
//		
//		var1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese El Primer Numero", "Numero", JOptionPane.PLAIN_MESSAGE));
//		
//		var2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese El Segundo Numero", "Numero", JOptionPane.PLAIN_MESSAGE));
//		
//		resultado = (var1>var2) ? var1 : var2 ;
//		
//		JOptionPane.showMessageDialog(null, "El Mayor Es: " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE);
//		//System.out.println(resultado);
		
		ArrayList<JugadoresFutbol> jugadoresBarcelonaFC = new ArrayList<>();
		
		JugadoresFutbol unJugador1 = new JugadoresFutbol();
		JugadoresFutbol unJugador2 = new JugadoresFutbol();
		JugadoresFutbol unJugador3 = new JugadoresFutbol();
		JugadoresFutbol unJugador4 = new JugadoresFutbol();
		JugadoresFutbol unJugador5 = new JugadoresFutbol();
		
		jugadoresBarcelonaFC.add(unJugador1);
		jugadoresBarcelonaFC.add(unJugador2);
		jugadoresBarcelonaFC.add(unJugador3);
		jugadoresBarcelonaFC.add(unJugador4);
		jugadoresBarcelonaFC.add(unJugador5);
		
		for(JugadoresFutbol unJugador : jugadoresBarcelonaFC) {
			
			unJugador.solicitarDatosJugador();
			System.out.println(unJugador.toString());
			
		}
		
		@SuppressWarnings("unchecked")
		ArrayList<JugadoresFutbol> listaClonadaDeJugadores = (ArrayList<JugadoresFutbol>) jugadoresBarcelonaFC.clone();
		listaClonadaDeJugadores.size();
		
		jugadoresBarcelonaFC.remove(unJugador5);
		System.out.println(jugadoresBarcelonaFC.contains(unJugador1));
		System.out.println(jugadoresBarcelonaFC.contains(unJugador3));
		System.out.println(jugadoresBarcelonaFC.contains(unJugador5));
		jugadoresBarcelonaFC.clear();
		System.out.println(jugadoresBarcelonaFC.size());
	}

}
