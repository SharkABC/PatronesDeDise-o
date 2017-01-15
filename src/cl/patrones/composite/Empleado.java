package cl.patrones.composite;

public class Empleado implements ISueldo {

	private String nombreCompleto;
	private  String cargo;
	private double sueldo;
	
	public Empleado(String nombreCompleto, String cargo, double sueldo) {
		setNombreCompleto(nombreCompleto);
		setCargo(cargo);
		setSueldo(sueldo);
	}

	public double getSueldo() {
		return sueldo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
}
