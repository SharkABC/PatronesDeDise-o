package cl.patrones.todo;

public class Observer {
	
	private static String nombre;

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Observer.nombre = nombre;
	}
}
