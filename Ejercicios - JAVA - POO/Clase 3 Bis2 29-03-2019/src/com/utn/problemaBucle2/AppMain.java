package com.utn.problemaBucle2;

import javax.swing.JOptionPane;

public class AppMain {

	public static void main(String[] args) {
		
		int password = 15165516;
		int passIngresada = 0;
		int flag = 0;
		
		do {
			
		if (flag == 1) {
			
			JOptionPane.showMessageDialog(null, "Ingreso Mal Su Contrasenia", "Mi Aplicacion", JOptionPane.WARNING_MESSAGE);
			
		}
		
		passIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su Password: "));
		
		flag = 1;
			
		} while(password != passIngresada);

		
		JOptionPane.showMessageDialog(null, "Bienvenido A Su Cuenta", "Mi Aplicacion", JOptionPane.INFORMATION_MESSAGE);
	}

}
