package cl.patrones.decorador;

public abstract class AutoDecorator implements Vendible {
	
	private Vendible vendible;
	
	public AutoDecorator(Vendible vendible){
		setVendible(vendible);
	}

	public Vendible getVendible() {
		return vendible;
	}

	public void setVendible(Vendible vendible) {
		this.vendible = vendible;
	}
}
