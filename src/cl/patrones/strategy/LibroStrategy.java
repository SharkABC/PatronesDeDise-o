package cl.patrones.strategy;

import cl.patrones.observer.Libro;

public interface LibroStrategy {

	public Libro findLibro(String titulo);
}
