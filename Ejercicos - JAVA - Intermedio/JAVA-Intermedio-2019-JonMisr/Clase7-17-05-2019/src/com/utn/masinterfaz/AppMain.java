package com.utn.masinterfaz;

public class AppMain {

	public static void main(String[] args) {
		
		Libro harryPotter = new Libro("1234", "Harry Potter Y El Cuento Jamas Contado", 2002);
		Revista chismes = new Revista("225", "Chismes", 2006, 10);
		Publicacion publicacion = new Publicacion("1001", "New York Times", 2014);
		
		System.out.println(harryPotter.toString());
		harryPotter.prestar();
		System.out.println(harryPotter.prestado());
		harryPotter.devolver();
		System.out.println(harryPotter.prestado());
		System.out.println(chismes.toString());
		
		System.out.println(publicacion.toString());

	}

}
