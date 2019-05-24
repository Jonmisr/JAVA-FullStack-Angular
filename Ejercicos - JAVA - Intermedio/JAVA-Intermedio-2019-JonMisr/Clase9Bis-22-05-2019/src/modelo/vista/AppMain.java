package modelo.vista;

import java.util.Scanner;

import modelo.conexion.PersonaVO;
import modelo.dao.PersonaDAO;

public class AppMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		PersonaVO unaPersona = new PersonaVO();
		PersonaVO mostrarPersona = new PersonaVO();
		PersonaDAO accesoPersona = new PersonaDAO();
		
		System.out.println("Ingrese El Id: ");
		unaPersona.setIdPersona(scanner.nextInt());
		System.out.println("Ingrese El Nombre: ");
		unaPersona.setNombrePersona(scanner.next());
		System.out.println("Ingrese La Edad: ");
		unaPersona.setEdadPersona(scanner.nextInt());
		System.out.println("Ingrese La Profesion: ");
		unaPersona.setProfesionPersona(scanner.next());
		System.out.println("Ingrese El Telefono: ");
		unaPersona.setTelefonoPersona(scanner.nextInt());
		
		accesoPersona.registraPersona(unaPersona);
		System.out.println("Ingrese El Id De La Persona A Buscar: ");
		mostrarPersona = accesoPersona.buscarPersona(scanner.nextInt());
		System.out.println(mostrarPersona.toString());
		System.out.println("Ingrese El Id De La Persona A Eliminar: ");
		accesoPersona.eliminarPersona(scanner.nextInt());
		
		scanner.close();
	}

}
