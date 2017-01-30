package cl.patrones.strategy;

import cl.patrones.observer.Libro;

public class NuevoBuenoRegularStrategy implements LibroStrategy {

	@Override
	public Libro findLibro(String titulo) {
		//Aqui iria un algoritmo que busque libros segun el titulo
		//Primero buscaria aquellos libros en estado nuevo
		//luego los buenos y por ultimo los regulares
		Libro libro = new Libro();
		libro.setEstado("Nuevo");
		return libro;
	}
}
