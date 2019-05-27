package modelo.controlador;

import java.util.Scanner;

import modelo.conexion.PersonaVO;

public class PersonaControl {
	
	Scanner scanner = new Scanner (System.in);
	
	public PersonaVO diosTodoCreador(int id) {
		
		PersonaVO vistaPersona = new PersonaVO();
	
		vistaPersona.setIdPersona(id);
		System.out.println("Ingrese El Nombre: ");
		vistaPersona.setNombrePersona(scanner.next());
		System.out.println("Ingrese La Edad: ");
		vistaPersona.setEdadPersona(scanner.nextInt());
		System.out.println("Ingrese La Profesion: ");
		vistaPersona.setProfesionPersona(scanner.next());
		System.out.println("Ingrese El Telefono: ");
		vistaPersona.setTelefonoPersona(scanner.nextInt());
		
		return vistaPersona;
	}
	
	public PersonaVO diosTodoCreador() {
		
		PersonaVO vistaPersona = new PersonaVO();
	
		System.out.println("Ingrese El Id: ");
		vistaPersona.setIdPersona(scanner.nextInt());
		System.out.println("Ingrese El Nombre: ");
		vistaPersona.setNombrePersona(scanner.next());
		System.out.println("Ingrese La Edad: ");
		vistaPersona.setEdadPersona(scanner.nextInt());
		System.out.println("Ingrese La Profesion: ");
		vistaPersona.setProfesionPersona(scanner.next());
		System.out.println("Ingrese El Telefono: ");
		vistaPersona.setTelefonoPersona(scanner.nextInt());
		
		return vistaPersona;
	}
	
	public int solicitarIDPersona() {
		
		System.out.println("Ingrese Un Id A Buscar: ");
		
		int id = scanner.nextInt();
		return id;
	}
	
}
