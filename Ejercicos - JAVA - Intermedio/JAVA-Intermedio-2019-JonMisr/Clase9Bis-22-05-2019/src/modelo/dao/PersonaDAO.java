package modelo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.conexion.Conexion;
import modelo.conexion.PersonaVO;

//Clase Que Nos Permite El Acceso A Los Datos De La Base

/**
 * Cuando Utilizamos Este Tipo De Clases Aplicando El Patron DAO - Data Access
 * Object, Basicamente Este Patron Consiste En Que Se Centralize Todos Los
 * Procesos De Acceso A Nuestra DB, Evitando De Esta Manera Tener
 * Inconsistencias Y Posibles Problemas Cuando Se Realiza Modificaciones De Tipo
 * Create, Read, Update ,Delete (CRUD). Con Este Patron Estamos Independizando
 * La Logica De Acceso A Los Datos Obteniendo Asi Una Organizacion Y
 * Flexibilidad En El Sistema.
 **/

public class PersonaDAO {

	public void registrarPersona(PersonaVO unaPersona) {

		Conexion connection = new Conexion();

		try {
			Statement estatuto = connection.getConnection().createStatement();
			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + unaPersona.getIdPersona() + "','"
					+ unaPersona.getNombrePersona() + "','" + unaPersona.getEdadPersona() + "','"
					+ unaPersona.getProfesionPersona() + "','" + unaPersona.getTelefonoPersona() + "')");

			System.out.println("Se Registro La Persona Correctamente");
			estatuto.close();

		} catch (SQLException e) {

			System.out.println(e.getMessage());
			System.err.println("No Se Pudo Registrar La Persona En La Base");

		} 
	}

	public PersonaVO buscarPersona(int codigo) {

		Conexion connection = new Conexion();
		boolean existe = false;
		PersonaVO unaPersona = new PersonaVO();

		try {
			PreparedStatement consulta = connection.getConnection()
					.prepareStatement("SELECT * FROM persona WHERE id = ? ");
			consulta.setInt(1, codigo);

			ResultSet res = consulta.executeQuery();
			while (res.next()) {

				existe = true;
				unaPersona.setIdPersona(Integer.parseInt(res.getString("id")));
				unaPersona.setNombrePersona(res.getString("nombre"));
				unaPersona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				unaPersona.setProfesionPersona(res.getString("profesion"));
				unaPersona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			}

		} catch (SQLException e) {
			System.err.println("ERROR - No Se Pudo Conectar Con La Base");
		} finally {
			connection.desconectar();
		}

		if (existe) {
			return unaPersona;
		} else {
			return null;
		}
	}
	
	public void modificarPersona(PersonaVO miPersona) {
		
		Conexion connection = new Conexion();
		
		try {
			
			String consulta = "UPDATE persona SET id= ?, nombre= ?, edad= ?, profesion= ?, telefono= ? WHERE id = ?";
			PreparedStatement estatuto = connection.getConnection().prepareStatement(consulta);
			
			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());
			
			estatuto.executeUpdate();
			
			System.out.println("Se Actualizo La Persona " + miPersona.getIdPersona() + " " + miPersona.getNombrePersona());
			
		} catch (SQLException e) {
			System.err.println("No Se Pudo Modificar La Persona " + miPersona.getIdPersona() + " " + miPersona.getNombrePersona());
		}

	}
	
	public void eliminarPersona(int codigo) {
		
		Conexion connection = new Conexion();
		
		try {

			Statement estatuto = connection.getConnection().createStatement();
			estatuto.executeUpdate("DELETE FROM persona WHERE id = '" + codigo + "'");
			System.out.println("Se Elimino El id = " + codigo + " Correctamente");
			estatuto.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.err.println("No Se Pudo Eliminar");
		} 
	}
}
