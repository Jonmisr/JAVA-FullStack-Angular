package modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * En Esta Clase Tendremos La Cadena De Conexion Con La Que Trabajara Nuestra Aplicacion,
 * En Esta Se Definira La Base De Datos, El User, La Password Y El Driver De Conexion.
 * Por Defecto Los Datos De Login De MySql Son:
 * Login = root
 * Password = vacio
 **/

public class Conexion {

	static String db = "personas"; // Nombre De Mi DB
	static String login = "root"; // Nombre De Usuario De La DB
	static String password = "";
	static String url = "jdbc:mysql://localhost/" + db;
	
	Connection conn = null;
	
	//Constructor De DBConnection
	
	public Conexion() {
				
		try{
			//Obtener Driver Para MySql
			Class.forName("com.mysql.jdbc.Driver");
			
			//Obtenemos Nuestra Conexion
			conn = DriverManager.getConnection(url, login, password);
			
			if (conn != null) {
				System.out.println("Conexion A La Base De Datos: (" + db + ") - OK");
			}
			
		} catch (SQLException e) { System.out.println(e); }
		
		  catch (ClassNotFoundException e) { System.out.println(e); }
		
		  catch (Exception e) { System.out.println(e); }
		
	}
	
	//Metodo Que Retorna La Conexion
	public Connection getConnection() { return conn; }
	
	//Metodo Para Desconectar La DB
	public void desconectar() { System.out.println("Desconectandose De La DB");
								conn = null; }
}
