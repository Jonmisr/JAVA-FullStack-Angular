package modelo.vista;

import java.util.Scanner;

import modelo.conexion.PersonaVO;
import modelo.controlador.PersonaControl;
import modelo.dao.PersonaDAO;

public class AppMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		PersonaVO unaPersona = new PersonaVO();
		PersonaDAO accesoPersona = new PersonaDAO();
		PersonaControl personaControl = new PersonaControl();

		System.out.println("Ingrese El Id De La Persona A Buscar: ");
		int id = scanner.nextInt();

		if ((accesoPersona.buscarPersona(id) != null)) {
			unaPersona = personaControl.diosTodoCreador(id);
			accesoPersona.modificarPersona(unaPersona);
		}

		else {
			System.out.println("No Existe El Id Buscado, Desea Crearlo ?");
			System.out.println("Ingrese: 1-Para Crear 2-Para Salir");
			int opcion = scanner.nextInt();

			if (opcion == 1) {
				unaPersona = personaControl.diosTodoCreador(id);
				accesoPersona.registrarPersona(unaPersona);
			} else {
				System.out.println("Gracias Por Usar Nuestra Aplicacion");
			}
		}

//		accesoPersona.registraPersona(unaPersona);
//		System.out.println("Ingrese El Id De La Persona A Buscar: ");
//		mostrarPersona = accesoPersona.buscarPersona(scanner.nextInt());
//		System.out.println(mostrarPersona.toString());
//		System.out.println("Ingrese El Id De La Persona A Eliminar: ");
//		accesoPersona.eliminarPersona(scanner.nextInt());

		scanner.close();
	}

}
