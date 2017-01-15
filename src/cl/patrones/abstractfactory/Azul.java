package cl.patrones.abstractfactory;

public class Azul extends Color {

	private boolean esPrimario;

	public void colorea(TV tv) {
		System.out.println("Pintando de azul el " + tv.getDescripcion());
	}

	public boolean isEsPrimario() {
		return esPrimario;
	}

	public void setEsPrimario(boolean esPrimario) {
		this.esPrimario = esPrimario;
	}
}
