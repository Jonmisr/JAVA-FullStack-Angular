package com.utn.claseAbstracta;

public class Guitarra extends Instrumento {

	public Guitarra() {
		tipo = "Guitarra";
		}
	
	@Override
	public void tocar() {

		System.out.println("Estoy Tocando La: " + tipo);
		
	}

}
