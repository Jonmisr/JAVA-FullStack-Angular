package com.utn.claseAbstracta;

public class Violin extends Instrumento{

	public Violin() {
		tipo = "Violin";
		}
	
	@Override
	public void tocar() {

		System.out.println("Estoy Tocando El: " + tipo);
		
	}
	
}
