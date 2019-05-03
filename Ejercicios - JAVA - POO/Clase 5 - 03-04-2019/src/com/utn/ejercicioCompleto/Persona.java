package com.utn.ejercicioCompleto;

import java.util.Scanner;

public class Persona {

	private static Scanner scanner = new Scanner(System.in);
	// Creacion De Constantes
	private static final char SDEFECTO = 'H';
	private static final float RMALO = -1.0F;
	private static final float DPESOIDEAL = 0.0F;
	private static final float SOBREPESO = 1.0F;

	// Creacion De Variables
	private String nombre = "";
	private int edad = 0;
	private int dni;
	private char sexo = SDEFECTO;
	private float peso = 0.0F;
	private float altura = 0.0F;

	// Constructor De La Clase
	public Persona() {

		this.generarDNI();
	}

	public Persona(String nombre, int edad, char sexo) {
		//super(); Este Es El Constructor Heredado De La Superclase "java.lang.Object"
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.generarDNI();
	}

	public Persona(String nombre, int edad, char sexo, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		this.generarDNI();
	}

	// Creacion De Getters y Setters
	public String getNombre() {
		return nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public int getDni() {
		return dni;
	}

	public float getPeso() {
		return peso;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public void setDni(int dni) {
		this.dni = dni;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	// Calculo Del Peso Ideal Por Medio Del Peso Y La Altura
	public float calcularIMC(float peso, float altura) {

		this.peso = peso;
		this.altura = altura;

		float pesoIdeal = peso / (altura * altura);

		if (pesoIdeal < 20) {

			System.out.println(nombre + " Se Encuentra En Su Peso Ideal");
			return RMALO;
		}

		else if ((pesoIdeal >= 20) && (pesoIdeal <= 25)) {

			System.out.println(nombre + " Esta Debajo De Su Peso Ideal");
			return DPESOIDEAL;
		}

		else {

			System.out.println(nombre + " Tiene SobrePeso");
			return SOBREPESO;
		}
	}

	public boolean esMayorDeEdad(int edad) {

		this.edad = edad;
		return edad >= 18;

	}

	public void comprobarSexo(char sexo) {

		this.sexo = sexo;

		if (!(sexo != 'H' && sexo != 'M')) {

			System.out.println("El Sexo Introducido Fue El Correcto");
		}

		else {

			System.out.println("El Sexo Introducido Fue Incorrecto");
			sexo = SDEFECTO;
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	private void generarDNI() {

		this.setDni((int) (Math.random() * 100000000) + 1);

	}
	
	public Persona ingresarPorTecladoTodosLosDatos() {

		System.out.println("Ingrese El Nombre: ");
		this.setNombre(scanner.next());

		System.out.println("Ingrese La Edad: ");
		this.setEdad(scanner.nextInt());

		System.out.println("Ingrese El Sexo: ");
		this.setSexo(scanner.next().charAt(0));

		System.out.println("Ingrese El Peso: ");
		this.setPeso(scanner.nextFloat());

		System.out.println("Ingrese La Altura: ");
		this.setAltura(scanner.nextFloat());

		return new Persona(nombre, edad, sexo, peso, altura);

	}
	
	public Persona ingresarCiertosDatos() {
		
		System.out.println("Ingrese El Nombre: ");
		this.setNombre(scanner.next());

		System.out.println("Ingrese La Edad: ");
		this.setEdad(scanner.nextInt());

		System.out.println("Ingrese El Sexo: ");
		this.setSexo(scanner.next().charAt(0));
		
		return new Persona(nombre, edad, sexo);
	}
	
	public void saberSiEsMayorDeEdad(Persona persona) {

		if (persona.esMayorDeEdad(persona.getEdad())) {

			System.out.println(persona.getNombre() + ": Es Mayor De Edad");
		}

		else {

			System.out.println(persona.getNombre() + ": No Es Mayor De Edad");

		}
	}

}
