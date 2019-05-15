package com.utn.ejercicio;

import java.util.ArrayList;

public class AppMain {

	public static void main(String[] args) {

		Multimedia unMultimedia = new Multimedia("Memories", "Neffex", Formato.MP3, "3:20");
		Multimedia otroMultimedia = new Multimedia("Myself", "Neffex", Formato.WAV, "2:45");
		Multimedia copiaMultimedia = new Multimedia("Myself", "Neffex", Formato.DVD, "2:45");
		ArrayList<Multimedia> multimedias = new ArrayList<>();
		ListaMultimedia listMultimedias = new ListaMultimedia(3); 
		
//-----------------------------------------------------------------------------------------------------------------// Primera Parte

		multimedias.add(unMultimedia);
		multimedias.add(otroMultimedia);
		multimedias.add(copiaMultimedia);

		for (Multimedia multimedia : multimedias) {

			System.out.println(multimedia.toString());
		}

		System.out.println(unMultimedia.equals(copiaMultimedia));
		System.out.println(otroMultimedia.equals(copiaMultimedia));

		Pelicula otraPelicula = new Pelicula("Brujeria", "Pepe", Formato.DVD, "01:45:00", "Horacio", "Laura");
		System.out.println(otraPelicula);
//		Pelicula unaPelicula = new Pelicula("Brujeria", "Pepe", Formato.DVD, "01:45:00", null, null);

//-----------------------------------------------------------------------------------------------------------------// Segunda Parte
			
		listMultimedias.add(unMultimedia);
		listMultimedias.add(otroMultimedia);
		listMultimedias.add(otraPelicula);
		
		System.out.println(listMultimedias.size());
		
		System.out.println(listMultimedias.add(unMultimedia));
		
		System.out.println(listMultimedias.get(0));
		
		System.out.println(listMultimedias.toString());
		
		System.out.println(listMultimedias.get(4));
	}

//-----------------------------------------------------------------------------------------------------------------// Final
}
