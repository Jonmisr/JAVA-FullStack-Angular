package com.utn.ejercicioCompleto;

/*
 * 1) Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el m�s adecuado, tambi�n su tipo. Si quieres a�adir alg�n atributo puedes hacerlo.
Por defecto, todos los atributos menos el DNI ser�n valores por defecto seg�n su tipo (0 n�meros, cadena vac�a para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.

Los m�todos que se implementaran son:

calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)), si esta f�rmula devuelve un valor menor que 20, la funci�n devuelve un -1, si devuelve un n�mero entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la funci�n devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la funci�n devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.

esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No sera visible al exterior.

toString(): devuelve toda la informaci�n del objeto.

generaDNI(): genera un n�mero aleatorio de 8 cifras, genera a partir de este su n�mero su letra correspondiente. Este m�todo sera invocado cuando se construya el objeto. Puedes dividir el m�todo para que te sea m�s f�cil. No ser� visible al exterior.
M�todos set de cada par�metro, excepto de DNI.

Ahora, crea una clase ejecutable que haga lo siguiente:

Pide por teclado el nombre, la edad, sexo, peso y altura.
instancia 3 objetos de la clase anterior, el primer objeto obtendr� las anteriores variables pedidas por teclado, el segundo objeto obtendr� todos los anteriores menos el peso y la altura y el �ltimo por defecto, para este �ltimo utiliza los m�todos set para darle a los atributos un valor.
Para cada objeto, deber� comprobar si esta en su peso ideal, tiene sobrepeso o por debajo de su peso ideal con un mensaje.
Indicar para cada objeto si es mayor de edad.
Por �ltimo, mostrar la informaci�n de cada objeto.
Puedes usar m�todos en la clase ejecutable, para que os sea mas f�cil.
 */

public class Appmain {

	public static void main(String[] args) {
		
		int array[] = new int[3];
		
		System.out.println(array[0] + " - " + array[1] + " - " + array[2]);
		
		array[0] = 5;
		array[1] = 10;
		array[2] = 20;
		
		System.out.println(array[0] + " - " + array[1] + " - " + array[2]);
				
		//Creacion De Los Objetos A Instanciar
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();

		//Instanciacion De Los 3 Objetos y Sus Seteos
		persona1.ingresarPorTecladoTodosLosDatos();

		persona2.ingresarCiertosDatos();
		persona2.setPeso(79.0f);
		persona2.setAltura(1.82f);

		persona3 = new Persona();

		persona3.setNombre("Nicolas");
		persona3.setEdad(15);
		persona3.setSexo('H');
		persona3.setPeso(71.6F);
		persona3.setAltura(1.78F);

		//Accion De Los Metodos y Procedimientos De Los Objetos
		persona1.calcularIMC(persona1.getPeso(), persona1.getAltura());
		persona1.saberSiEsMayorDeEdad(persona1);

		persona2.calcularIMC(persona2.getPeso(), persona2.getAltura());
		persona2.saberSiEsMayorDeEdad(persona2);

		persona3.calcularIMC(persona3.getPeso(), persona3.getAltura());
		persona3.saberSiEsMayorDeEdad(persona3);

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

	}

}
