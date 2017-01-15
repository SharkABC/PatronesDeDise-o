package cl.patrones.decorador;

public class CDPlayer extends AutoDecorator {

	public CDPlayer(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + " + CD Player";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 100;
	}
}
