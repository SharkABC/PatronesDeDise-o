package cl.patrones.observer;

public class Compras implements ILibroMalEstado {

	@Override
	public void update() {
		System.out.println("Compras: ");
		System.out.println("Solicito nueva cotizacion");
		System.out.println("---");
	}
}
