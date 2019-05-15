package com.utn.ejercicio;

import java.util.ArrayList;

public class ListaMultimedia {

	ArrayList<Multimedia> multimedias;
	private int cantidadMultimedias;
	
	public ListaMultimedia(int numeroMaximo) {
		
		this.cantidadMultimedias = numeroMaximo;
		multimedias = new ArrayList<>();
	}
	
	public ArrayList<Multimedia> getMultimedias() {
		return multimedias;
	}

	public void setMultimedias(ArrayList<Multimedia> multimedias) {
		this.multimedias = multimedias;
	}

	public int getCantidadMultimedias() {
		return cantidadMultimedias;
	}

	public void setCantidadMultimedias(int cantidadMultimedias) {
		this.cantidadMultimedias = cantidadMultimedias;
	}

	public int size() {	
		
		return multimedias.size();
	}
	
	private boolean estaCompleto() {
		
		return this.size() == getCantidadMultimedias();
	}
	
	public boolean add(Multimedia unMultimedia) {
		
		if(estaCompleto()) {return false;}
		
		multimedias.add(unMultimedia);
		return true;
	}
	
	public Multimedia get(int posicion) {
		
		if(posicion > this.getCantidadMultimedias()) {		
			throw new IndexOutOfBoundsException();
		}
		
		return multimedias.get(posicion);
	}
	
	@Override
	public String toString() {
		
		String concatenado = "Lista De Multimedias:\n";
		
		for(int i=0; i < this.getCantidadMultimedias(); i++) {
			concatenado += multimedias.get(i) + "\n";
		}
		
		return concatenado;
	}
	
}
