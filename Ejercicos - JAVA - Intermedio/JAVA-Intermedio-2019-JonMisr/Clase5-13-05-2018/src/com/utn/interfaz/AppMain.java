package com.utn.interfaz;

import java.util.ArrayList;

public class AppMain {

	// Interfaces
	/**
	 * En La Programaci�n OO, A Veces Es �til Definir Que Debe Hacer Una Clase, Pero
	 * No C�mo Lo Har�. Una Interfaz (Interface) Es Sint�cticamente Similar A Una
	 * Clase Abstracta, En La Que Se Puede Especificar Uno O M�s M�todos Que No
	 * Tienen Cuerpo ({}). Esos M�todos Deben Ser Implementados Por Una Clase Para
	 * Que Se Definan Sus Acciones. Una Vez Que Se Define Una Interfaz Cualquier
	 * Cantidad De Clases Puede Implementarla. Adem�s Una Clase Puede Implementar
	 * Cualquier Cantidad De Interfaces. Para Implementar Una Interfaz, Una Clase
	 * Debe Proporcionar Cuerpos (Implementaciones) Para Los M�todos Descritos Por
	 * La Interfaz. Cada Clase Es Libre De Determinar Los Detalles De Su Propia
	 * Implementaci�n. Dos Clases Pueden Implementar La Misma Interfaz De Diferentes
	 * Maneras, Pero Cada Clase A�n Admite El Mismo Conjunto De M�todos.
	 * 
	 * En Una Interfaz, Los M�todos Son Implicitamente P�blicos. Las Variables
	 * Declaradas En Una Interfaz No Son Variables De Instancia, Son Impl�citamente
	 * Public, Final Y Static. Deben Inicializarse, Por Lo Tanto, Son Esencialmente
	 * Constantes.
	 * 
	 * Si Una Clase Incluye Una Interfaz Pero No Implementa Los M�todos Definidos
	 * Por Esa Interfaz, Esa Clase Debe Declararse Como Abstracta (Abstract), No Se
	 * Pueden Crear Objetos De Dicha Clase, Pero Se Podr� Usar Como Una SuperClase
	 * Abstracta, Lo Que Permite Que Las SubClases Proporcionen La Implementaci�n
	 * Completa.
	 * 
	 * Referencias A Interface: Se Puede Declarar Una Variable De Referencia De Un
	 * Tipo De Interfaz. En Otras Palabras Puede Crear Una Variable De Referencia De
	 * Interfaz. Dicha Variable Puede Referirse A Cualquier Objeto Que Implemente Su
	 * Interfaz. Cuando Llamamos A Un M�todo En Un Objeto A Trav�s De Una Referencia
	 * De Interfaz, Es La Versi�n Del M�todo Implementado Por El Objeto Que Se
	 * Ejecuta. Este Proceso Es Muy Similar Al Uso De Referencia De SuperClase Para
	 * Acceder A Un Objeto De SubClase.
	 * 
	 * JDK 8 : En Esta Versi�n Se Agreg� Una Funci�n A Interface Que Gener� Un
	 * Cambio Significativo En Sus Capacidades. Antes De Esta Versi�n No Pod�amos
	 * Definir Ninguna Implementaci�n De Ning�n Tipo. Hoy Es Posible Agregar Una
	 * Implementaci�n Predeterminada A Un M�todo De La Interfaz.
	 * 
	 * JDK 9 : Podemos Incluir M�todos Privados. Sin Embargo Estas Nuevas Cualidades
	 * Son De Uso Especial, Por Lo Tanto, Como Regla General, Con Frecuencia Solo Se
	 * Crear� Y Utilizar� Interfaces En Las Que No Se Utilizar�n Estas Nuevas
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
