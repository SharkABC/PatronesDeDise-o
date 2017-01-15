package cl.patrones.abstractfactory;

public class LCD extends TV {

	private double costoFabricacion;
	
	public LCD(){
		setDescripcion("LCD");
	}
	
	public LCD(String marca, int pulgadas, String color, String descripcion,
			double precio, double costoFabricacion) {
		super(marca, pulgadas, color, descripcion, precio);
		setCostoFabricacion(costoFabricacion);
	}


	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}
}
