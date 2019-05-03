package com.utn.claseGetSet;

public class EmpleadoApp {

	public static void main(String[] args) {

		// Array De Objetos De La Clase Empleados
		Empleado arrayEmpleados[] = new Empleado[3];

		// Objetos En Cada Posicion

//		arrayEmpleados[0] = new Empleado("Pepe");
//		arrayEmpleados[1] = new Empleado("Juan", "Rodriguez");
//		arrayEmpleados[2] = new Empleado("Jonathan", "Misrahi", 22);
//		arrayEmpleados[3] = new Empleado("Marcelo", "Oswaldo", 42, 21150);

//		arrayEmpleados[1].setSalario(15000);
//		arrayEmpleados[2].setSalario(32150);
		
			for(Empleado unEmpleado : arrayEmpleados) { //Uso del forEach
			unEmpleado = new Empleado();
			unEmpleado.solicitarDatosDelEmpleado();
			
			}
		
		int suma = 0;

			for(Empleado unEmpleado: arrayEmpleados){
			//arrayEmpleados[i].solicitarDatosDelEmpleado();
			
			suma += unEmpleado.getSalario();
			System.out.println(unEmpleado.toString());

			// Ctrl+Shift+C
			// System.out.println(arrayEmpleados[i].getNombre());
			// System.out.println(arrayEmpleados[i].getApellido());
			// System.out.println(arrayEmpleados[i].getEdad());
			}

		System.out.println("La Suma Total Del Salario Entre Todos Es: " + suma);
	}

}