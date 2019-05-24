package modelo.conexion;

public class PersonaVO {

	/**Patron Value Object - Data Transfer Object (Anteriormente)
	 * Representamos Las Entidades (Tablas Dentro De La DB)
	 * La Tabla Consta De Los Campos Id, Nombre, Edad, Profesion, Telefono,
	 * Entonces La Clase VO - DTO Tendra Los Mismos Atributos Y De Esta Forma,
	 * Podremos Transportar Un Objeto De Tipo Persona Con Todos Esos Valores Por Medio De
	 * Los Metodos Getter's Y Setter's.
	 * Este Patron Facilitara El Transporte De Informacion, Evitando Asi Que Se Envien Gran Cantidad
	 * De Parametros A Un Metodo Que Queremos Hacer Un Registro O Una Actualizacion.
	 * Tambien En Caso De Que En Un Futuro Se Modifique La Tabla En La DB, Nuestra Clase Debera Ser
	 * Modificada (Metodos Y Atributos). 
	 **/
	
	private int idPersona;
	private String nombrePersona;
	private int edadPersona;
	private String profesionPersona;
	private int telefonoPersona;	

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public int getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(int telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	@Override
	public String toString() {
		return "PersonaVO [idPersona = " + idPersona + ", nombrePersona = " + nombrePersona + ", edadPersona = " + edadPersona
				+ ", profesionPersona = " + profesionPersona + ", telefonoPersona = " + telefonoPersona + "]";
	}
	
	
}
