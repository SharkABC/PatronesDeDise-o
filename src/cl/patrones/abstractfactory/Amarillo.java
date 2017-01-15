package cl.patrones.abstractfactory;

public class Amarillo extends Color {

	private boolean esPrimario;

	public void colorea(TV tv) {
		System.out.println("Pintando de amarillo el " + tv.getDescripcion());
	}

	public boolean isEsPrimario() {
		return esPrimario;
	}

	public void setEsPrimario(boolean esPrimario) {
		this.esPrimario = esPrimario;
	}
}
