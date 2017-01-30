package cl.patrones.strategy;

import java.util.ArrayList;

import cl.patrones.observer.Libro;

public class BuenoNuevoRegularStrategy implements LibroStrategy {

	@Override
	public Libro findLibro(String titulo) {
		ArrayList<Libro> libros = Biblioteca.obtenerLibros();
		//Aqui iria un algoritmo que busque libros segun el titulo
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		return libro;
	}
}
