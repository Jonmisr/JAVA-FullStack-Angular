package com.utn.fooCorp;

public class Appmain {

	public static void main(String[] args) {
	
	FooCorporation	arrayEmpleados[] = new FooCorporation[3];
	FooCorporation empleado = new FooCorporation();
	empleado.ingresarValoresDelEmpleado();
	System.out.println(empleado.toString());
	empleado.saldoEnTotal(empleado.getHorasTrabajadas(), empleado.getSaldoBase());
	
	for(int i = 0; i < arrayEmpleados.length; i++) {
		
		arrayEmpleados[i] = new FooCorporation();
		arrayEmpleados[i].ingresarValoresDelEmpleado();
		arrayEmpleados[i].saldoEnTotal(empleado.getHorasTrabajadas(), empleado.getSaldoBase());
	}

	}

}
