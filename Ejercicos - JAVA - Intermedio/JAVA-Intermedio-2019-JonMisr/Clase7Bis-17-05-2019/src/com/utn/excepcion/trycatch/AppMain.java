package com.utn.excepcion.trycatch;

import javax.swing.JOptionPane;

public class AppMain {

	/**
	 * Exception:
	 * Es Un Error Que Ocurre En Tiempo De Ejecucion Utilizando El Subsistema De Manejo De Excepciones de Java,
	 * Se Puede De Una Manera Estructurada Y Controlada, Manejar Todos Los Errores De Tiempo De Ejecucion.
	 * 
	 * Manejo De Excepciones:
	 * Una Ventaja Principal Del Manejo De Excepciones Es Que Nos Automatiza Gran Parte
	 * Del Codigo De Manejo De Errores, Que Antiguamente Se Debian Hacerlo A Mano En Cualquier Programa.
	 * 
	 * Por Ejemplo:
	 * En Algunos Lenguajes Mas Antiguos, Los Codigos De Error Se Devuelven Cuando Falla Un Metodo, Y Estos
	 * Valores Se Debian Verificar Manualmente, Cada Vez Que Llamamos A Ese Metodo.
	 * 
	 * El Manejo De Excepciones Nos Agiliza El Manejo De Errores Al Permitir Que Tu Programa Defina Un
	 * Bloque De Codigo Llamado Manejador De Excepcion, Que Se Ejecuta Automaticamente Cuando Ocurre Un Error.
	 *
	 * Otra Razon Por La Que El Manejo De Excepciones Es Importante Es Que Java Nos Define Excepciones
	 * Estandar Para Errores Comunes De Programa. Nuestro Programa Debe Vigilar Y Capturar Estas Excepciones.
	 * 
	 * Jerarquia De Excepciones:
	 * Tenemos Dos Subclases Directas De Throwable: Exception Y Error
	 * 
	 * 1 - Error: Estan Relacionados Con Errores Que Ocurren En La JVM Y No En El Programa, Este Tipo De
	 *     Errores Se Escapan De Nuestro Control Y Por Lo General, El Programa No Se Va A Ocupar De Ellas.
	 *     
	 * 2 - Exception: Son Errores Que Resultan De La Actividad De Nuestro Programa, Por Ejemplo, Intentar
	 *     Dividir Por Cero, Superar Los Limites De Un Vector, En General, Tu Programa Debe Manejar Exception
	 *     De Este Tipo, Una Subclase Importante De Exception Es RUNTIME Exception, Que Se Usa Para Representar
	 *     Varios Tipos Comunes De Errores En Tiempo De Ejecucion.
	 *     
	 * Fundamentos De Manejos De Excepciones:
	 * Estas Se Gestionan A Traves De 5 Palabras Claves:
	 * Try - Catch - Throw - Throws - Finally. Estos Forman Un Sistema InterRelacionado En El Que, El Uso
	 * De Uno No Implica El De Otro. 
	 *
	 **/
	
	
	public static void main(String[] args){
		
		try {
			
			System.out.println("Antes De Que Se Genere La Excepcion ");
			Integer.parseInt(JOptionPane.showInputDialog("Ingrese Algo: "));
			ExcepNueva.forzarException();
			
			
		} catch (Exception e) {	
			
				System.out.println("Entro En La Excepcion ");
				System.out.println(e.toString());
				e.printStackTrace();
				e.fillInStackTrace();
				e.printStackTrace();
			
		} 
		
		System.out.println("Despues De Que Genere Una Excepcion ");
	}

}
