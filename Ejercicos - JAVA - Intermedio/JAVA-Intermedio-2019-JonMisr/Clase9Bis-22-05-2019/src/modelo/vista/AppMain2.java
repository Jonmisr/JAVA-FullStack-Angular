package modelo.vista;

import java.util.Scanner;

import modelo.conexion.PersonaVO;
import modelo.controlador.PersonaControl;
import modelo.dao.PersonaDAO;

public class AppMain2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean opcion = true;

		PersonaControl pc = new PersonaControl();
		PersonaDAO pd = new PersonaDAO();

		do {

			System.out.println("Ingrese La Opcion Deseada: ");
			System.out.println("Opcion 1 - Buscar Persona");
			System.out.println("Opcion 2 - Agregar Persona");
			System.out.println("Opcion 3 - Modificar Persona");
			System.out.println("Opcion 4 - Eliminar Persona");
			System.out.println("Opcion Aleatoria - Salir Del Programa");

			int opcionIngresada = scanner.nextInt();

			switch (opcionIngresada) {

			case 1:
				PersonaVO pvo = pd.buscarPersona(pc.solicitarIDPersona());

				if (pvo != null) {
					System.out.println(pvo.toString());
				}

				else {
					System.err.println("No Se Encontro La Persona A Buscar");
				}

				break;

			case 2:
				pd.registrarPersona(pc.diosTodoCreador());
				break;

			case 3:
				int idBuscado = pc.solicitarIDPersona();
				if (pd.buscarPersona(idBuscado) != null) {
					pd.modificarPersona(pc.diosTodoCreador(idBuscado));
				}

				else {
					System.err.println("No Se Encontro La Persona A Modificar");
				}
				break;

			case 4:
				int idAEliminar = pc.solicitarIDPersona();
				if (pd.buscarPersona(idAEliminar) != null) {
					pd.eliminarPersona(idAEliminar);
				}

				else {
					System.err.println("No Se Encontro La Persona A Eliminar");
				}

				break;

			default:
				opcion = false;
				System.out.println("Saliendo Del Programa");
				break;
			}

		} while (opcion);

		scanner.close();
	}

}
