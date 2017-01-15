package cl.patrones.decorador;

public abstract class Auto implements Vendible {
	
	private int puertas = 4;
	private int ruedas = 4;
	
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
}
