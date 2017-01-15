package cl.patrones.decorador;

public class AireAcondicionado extends AutoDecorator{

	public AireAcondicionado(Vendible vendible) {
		super(vendible);
	}

	public String getDescripcion() {
		return getVendible().getDescripcion() + " + Aire Acondicionado";
	}

	public int getPrecio() {
		return getVendible().getPrecio() + 1500;
	}

}
