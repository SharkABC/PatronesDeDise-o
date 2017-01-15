package cl.patrones.decorador;

public class Gasoil extends AutoDecorator {

	public Gasoil(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + " + Gasoil";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 12000;
	}

	
}
