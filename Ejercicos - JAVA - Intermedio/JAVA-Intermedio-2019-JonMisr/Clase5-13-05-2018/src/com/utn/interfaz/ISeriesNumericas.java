package com.utn.interfaz;


//Definicion De Una Interface Llamada ISeriesNuméricas
//Esta Interfaz Se Declaro Public Para Que Pueda Ser Implementada Por Cualquier Otro Package

public interface ISeriesNumericas {

	//Retorna El Siguiente Número De La Serie
	int getSiguiente();
	
	//Reiniciar Serie
	void reiniciar();
	
	//Método Que Establece Un Valor Inicial
	void setComenzar(int x);
	
}
