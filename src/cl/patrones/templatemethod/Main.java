package cl.patrones.templatemethod;

/*
 * Define una estructura algorítmica cuya lógica quedará a cargo 
 * de las subclases. Para ello, escribe una clase abstracta que 
 * contiene parte de la lógica necesaria para realizar su finalidad.
 * En ella se define una estructura de herencia que sirve de plantilla 
 * ("Template" significa plantilla) de los métodos en las subclases.
 * 
 * - Se quiera factorizar el comportamiento común de varias subclases.
 * - Se necesite implementar las partes fijas de un algoritmo una sola vez y dejar que las subclases implementen las partes variables.
 * - Se busque controlar las ampliaciones de las subclases, convirtiendo en métodos plantillas aquéllos métodos que pueden ser redefinidos.
 */
public class Main {
	
	public static void main(String[] args) {
		Persona p = new Cliente(12121);
		System.out.println("El cliente dice: ");
		System.out.println(p.identificate());
		
		System.out.println("El empleado dice: ");
		p = new Empleado("AD 41252");
		System.out.println(p.identificate());
	}

}
