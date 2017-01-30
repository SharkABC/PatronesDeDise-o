package cl.patrones.strategy;

import cl.patrones.observer.Libro;

public class Main {
	
	public static void main(String[] args) {
		Socio socio = new Socio();
		Libro libro = new LibroFinder().findLibro(socio,  "El nombre del viento.");
		System.out.println(libro.getEstado());
	}
}
