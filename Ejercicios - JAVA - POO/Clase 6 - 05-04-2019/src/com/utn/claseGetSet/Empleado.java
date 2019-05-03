package com.utn.claseGetSet;

import javax.swing.JOptionPane;

public class Empleado {

	private String nombre;
	private String apellido;
	int edad;
	int salario;
	
	//Constructores
	/* 
	 * Un Constructor Es Un Metodo Especial De Una Clase Que Se Llama Automaticamente
	 * Siempre Que Se Declara Un Objeto De Esa Clase
	 * Su Funcion Es Inicializar El Objeto Y Sirve Para Asegurarnos Que Los Objetos
	 * Siempre Contengan Valores Validos
	 * 
	 * 
	 * Cuando Se Crea Un Objeto En Java Se Realizan Las Siguientes Operaciones Automaticamente:
	 * 
	 *  1.Se asigna memoria para el objeto
	 *  2.Se Inicializan Los Atributos De Ese Objeto Con Los Valores Predeterminados Por El Sistema
	 *  3.Se Llama Al Constructor De La Claese Que Puede Ser Uno Entre Varios
	 *  
	 *  El Constructor De La Clase Tiene Las Siguientes Caracteristicas:
	 *  
	 *  a) No Se Hereda 
	 *  b) En Una Clase Puede Haber Varios Constructores Con El Mismo Nombre Y
	 *     Distintos Numeros De Argumentos (No Se Puede Sobrecargar)
	 *  c) Debe Declararse Siempre Publico (Salvo Casos Muy Excepcionales) Para Que Pueda Ser
	 *     Invocado Desde Cualquier Parte Donde Se Desee Crear Un Objeto De Su Clase*/
	
	public Empleado() {}
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	public Empleado(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public Empleado(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public Empleado(String nombre, String apellido, int edad, int salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	//Encapsulamiento
	/*
	 * Todos Los Atributos De La Clase Con Modificador De Acceso Privado
	 * Se Accede Mediante Metodos Publicos
	 * */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario
				+ "]";
	}
	
	private int auxiliar;
	private boolean flag = false;
	
	//Defino Metodos Para Soliciatar Datos Al Usuario
	public void solicitarDatosDelEmpleado() {
		
		this.nombre = JOptionPane.showInputDialog("Escribe Un Nombre: ");
		this.apellido = JOptionPane.showInputDialog("Escribe Un Apellido");
		
		do {
			
			if (flag) {
				
				JOptionPane.showConfirmDialog(null, "Ingreso Una Edad Invalida", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		flag = true;	
		this.auxiliar = Integer.parseInt(JOptionPane.showInputDialog("Escribe Una Edad: "));
		
		}while(auxiliar <= 0);
		
		this.edad = auxiliar;
		
		this.salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese El Salario: "));
		
	}
}
