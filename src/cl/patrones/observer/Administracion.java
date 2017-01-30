package cl.patrones.observer;

public class Administracion implements ILibroMalEstado {

	public void update() {
		System.out.println("Administración: ");
		System.out.println("Envio una queja formal...");
		System.out.println("---");
	}
}
