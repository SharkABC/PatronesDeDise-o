package cl.patrones.strategy;

import cl.patrones.observer.Libro;

public class RegularBuenoNuevoStrategy implements LibroStrategy {

	@Override
	public Libro findLibro(String titulo) {
		Libro libro = new Libro();
		libro.setEstado("Regular");
		return libro;
	}
}
