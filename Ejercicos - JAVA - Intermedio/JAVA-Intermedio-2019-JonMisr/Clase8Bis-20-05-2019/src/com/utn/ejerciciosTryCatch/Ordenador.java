package com.utn.ejerciciosTryCatch;

import java.util.Random;

public class Ordenador {

	private int numeroAdivinar;
	private int cantidadDeIntentos;
	private static Ordenador unOrdenador;
	
	private Ordenador() { setNumeroAdivinarRandom(); 
						 cantidadDeIntentos = 0;}
	
    public static Ordenador instanciarUnaVez() {
        if (unOrdenador == null){
            unOrdenador = new Ordenador();
        }
        
        return unOrdenador;
    }
	
	public int getNumeroAdivinar() {
		return numeroAdivinar;
	}
	
	private int getCantidadIntentos() {
		return cantidadDeIntentos;
	}

	public void setCantidadIntentos() {
		this.cantidadDeIntentos++;
	}
	
	public void setNumeroAdivinarRandom() {
		Random random = new Random();
		this.numeroAdivinar = (int) (random.nextInt(500) + 1);
	}
	
	public boolean adivineElNumero(String valor) {
		
		try {
			
		int numeroElegido = Integer.parseInt(valor);
		
		if(numeroElegido > getNumeroAdivinar()) {
			
			System.out.println("El Numero Ingresado Resulto Mayor Al Esperado, Ingrese Otro Valor");
			setCantidadIntentos();
			return false;
			
		}
		
		else if (numeroElegido < getNumeroAdivinar()) {
			
			System.out.println("El Numero Ingresado Resulto Menor Al Esperado, Ingrese Otro Valor");
			setCantidadIntentos();
			return false;
		}
		
		else { System.out.println("Valor Correcto - ¡USTED GANA!");
			   return true;}
		
		} catch(Exception e) {  System.err.println("Lo Ingresado No Fue Un Valor, Se Conto El Intento");
								setCantidadIntentos();
								return false;}
		
	}
	
	public int devolverIntentosCantidad() {	
		return getCantidadIntentos();
	}
	
}
