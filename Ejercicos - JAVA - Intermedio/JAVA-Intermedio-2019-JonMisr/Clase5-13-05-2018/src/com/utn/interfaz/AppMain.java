package com.utn.interfaz;

import java.util.ArrayList;

public class AppMain {

	// Interfaces
	/**
	 * En La Programación OO, A Veces Es Útil Definir Que Debe Hacer Una Clase, Pero
	 * No Cómo Lo Hará. Una Interfaz (Interface) Es Sintácticamente Similar A Una
	 * Clase Abstracta, En La Que Se Puede Especificar Uno O Más Métodos Que No
	 * Tienen Cuerpo ({}). Esos Métodos Deben Ser Implementados Por Una Clase Para
	 * Que Se Definan Sus Acciones. Una Vez Que Se Define Una Interfaz Cualquier
	 * Cantidad De Clases Puede Implementarla. Además Una Clase Puede Implementar
	 * Cualquier Cantidad De Interfaces. Para Implementar Una Interfaz, Una Clase
	 * Debe Proporcionar Cuerpos (Implementaciones) Para Los Métodos Descritos Por
	 * La Interfaz. Cada Clase Es Libre De Determinar Los Detalles De Su Propia
	 * Implementación. Dos Clases Pueden Implementar La Misma Interfaz De Diferentes
	 * Maneras, Pero Cada Clase Aún Admite El Mismo Conjunto De Métodos.
	 * 
	 * En Una Interfaz, Los Métodos Son Implicitamente Públicos. Las Variables
	 * Declaradas En Una Interfaz No Son Variables De Instancia, Son Implícitamente
	 * Public, Final Y Static. Deben Inicializarse, Por Lo Tanto, Son Esencialmente
	 * Constantes.
	 * 
	 * Si Una Clase Incluye Una Interfaz Pero No Implementa Los Métodos Definidos
	 * Por Esa Interfaz, Esa Clase Debe Declararse Como Abstracta (Abstract), No Se
	 * Pueden Crear Objetos De Dicha Clase, Pero Se Podrá Usar Como Una SuperClase
	 * Abstracta, Lo Que Permite Que Las SubClases Proporcionen La Implementación
	 * Completa.
	 * 
	 * Referencias A Interface: Se Puede Declarar Una Variable De Referencia De Un
	 * Tipo De Interfaz. En Otras Palabras Puede Crear Una Variable De Referencia De
	 * Interfaz. Dicha Variable Puede Referirse A Cualquier Objeto Que Implemente Su
	 * Interfaz. Cuando Llamamos A Un Método En Un Objeto A Través De Una Referencia
	 * De Interfaz, Es La Versión Del Método Implementado Por El Objeto Que Se
	 * Ejecuta. Este Proceso Es Muy Similar Al Uso De Referencia De SuperClase Para
	 * Acceder A Un Objeto De SubClase.
	 * 
	 * JDK 8 : En Esta Versión Se Agregó Una Función A Interface Que Generó Un
	 * Cambio Significativo En Sus Capacidades. Antes De Esta Versión No Podíamos
	 * Definir Ninguna Implementación De Ningún Tipo. Hoy Es Posible Agregar Una
	 * Implementación Predeterminada A Un Método De La Interfaz.
	 * 
	 * JDK 9 : Podemos Incluir Métodos Privados. Sin Embargo Estas Nuevas Cualidades
	 * Son De Uso Especial, Por Lo Tanto, Como Regla General, Con Frecuencia Solo Se
	 * Creará Y Utilizará Interfaces En Las Que No Se Utilizarán Estas Nuevas
	 * Funcionalidades.
	 **/

	public static void main(String[] args) {

		SerieNumericaDeDosEnDos dosEnDos = new SerieNumericaDeDosEnDos();
		DeTres tresEnTres = new DeTres();
		
		ConstanteD constante = new ConstanteD();
		ISeriesNumericasHerencia serieNumerica = new SerieNumericaDeDosEnDos();
		
		//serieNumerico: Es El Objeto Declarado Como Referencia A La Interfaz ISeriesNumericas
		
		ArrayList<ISeriesNumericasHerencia> listaSeriesNumericas = new ArrayList<>();
		listaSeriesNumericas.add(dosEnDos);
		listaSeriesNumericas.add(tresEnTres);
		
		for(int j = 0; j < 5; j++) {
			
			for(ISeriesNumericasHerencia unaSerie: listaSeriesNumericas) {	
				
				if(unaSerie.equals(dosEnDos)) {
				System.out.println("Ref, Siguiente Valor DeDos Es: " + unaSerie.getSiguiente());
				System.out.println("Ref, Anterior Valor DeDos Es: " + unaSerie.getAnterior());
				}
				else {System.out.println("Ref, Siguiente Valor DeTres Es: " + unaSerie.getSiguiente());
					  System.out.println("Ref, Anterior Valor DeDos Es: " + unaSerie.getAnterior());}
			}
		}
		
		constante.metodoConstante();
	}

}
