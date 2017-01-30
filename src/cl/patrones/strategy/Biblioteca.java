package cl.patrones.strategy;

import java.util.ArrayList;

import cl.patrones.observer.Libro;

public class Biblioteca {
	
	private static ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public Biblioteca(){
		Libro libro = new Libro();
		libro.setEstado("Bueno");
		libro.setTitulo("Un titulo");
		
		//Crear mas libros
		libros.add(libro);
	}
	
	public static ArrayList<Libro> obtenerLibros(){
		return libros;
	}

}
