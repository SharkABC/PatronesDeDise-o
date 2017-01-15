package cl.patrones.todo;

public class Xbox extends Plataforma {

	private String tamaño;
	
	public Xbox(String nombre, String version, 
			String tamaño) {
		super(nombre, version);
		setTamaño(tamaño);
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Xbox [nombre=:" + getNombre()
				+ ", version=" + getVersion()
				+ ", tamaño=" + getTamaño()
				+ "]";
	}
}
