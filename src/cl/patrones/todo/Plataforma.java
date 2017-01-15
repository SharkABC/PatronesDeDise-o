package cl.patrones.todo;

public abstract class Plataforma implements Cloneable {
	
	private String nombre;
	private String version;
	
	public Plataforma(String nombre, String version){
		setNombre(nombre);
		setVersion(version);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public String toString() {
		return "Plataforma [nombre=" + nombre + ", version=" + version + "]";
	}
}
