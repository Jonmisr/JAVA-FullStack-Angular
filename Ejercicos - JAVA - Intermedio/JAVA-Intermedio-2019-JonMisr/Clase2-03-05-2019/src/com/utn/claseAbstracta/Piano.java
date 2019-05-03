package com.utn.claseAbstracta;

public class Piano extends Instrumento{

	public Piano() {
		tipo = "Piano";
		}
	
	@Override
	public void tocar() {

		System.out.println("Estoy Tocando El: " + tipo);
		
	}
	
}
