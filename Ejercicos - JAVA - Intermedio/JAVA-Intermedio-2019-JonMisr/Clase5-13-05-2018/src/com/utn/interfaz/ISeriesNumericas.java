package com.utn.interfaz;


//Definicion De Una Interface Llamada ISeriesNum�ricas
//Esta Interfaz Se Declaro Public Para Que Pueda Ser Implementada Por Cualquier Otro Package

public interface ISeriesNumericas {

	//Retorna El Siguiente N�mero De La Serie
	int getSiguiente();
	
	//Reiniciar Serie
	void reiniciar();
	
	//M�todo Que Establece Un Valor Inicial
	void setComenzar(int x);
	
}
