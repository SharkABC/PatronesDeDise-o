package cl.patrones.todo;

public class PlayStation extends Plataforma {

	private String color;
	
	public PlayStation(String nombre, String version, 
			String color) {
		super(nombre, version);
		setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "PlayStation ["
				+ "nombre=" + getNombre()
				+ "version=" + getVersion() 
				+ "color=" + color 
				+ "]";
	}
}
