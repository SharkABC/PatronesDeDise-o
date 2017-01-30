package cl.patrones.observer;

public class Stock implements ILibroMalEstado{

	@Override
	public void update() {
		System.out.println("Stock: ");
		System.out.println("Le doy de baja...");
		System.out.println("---");
	}
}
