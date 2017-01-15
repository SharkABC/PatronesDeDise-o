package cl.patrones.abstractfactory;

public class Plasma extends TV{

	private double anguloVision;
	private double tiempoRespuesta;
	
	public Plasma() {
		setDescripcion("Plasma... proximamente sera un LED");
	}
	
	public Plasma(String marca, int pulgadas, String color, String descripcion,
			double precio) {
		super(marca, pulgadas, color, descripcion, precio);
		setAnguloVision(anguloVision);
		setTiempoRespuesta(tiempoRespuesta);
	}
	
	public double getAnguloVision() {
		return anguloVision;
	}
	public void setAnguloVision(double anguloVision) {
		this.anguloVision = anguloVision;
	}
	public double getTiempoRespuesta() {
		return tiempoRespuesta;
	}
	public void setTiempoRespuesta(double tiempoRespuesta) {
		this.tiempoRespuesta = tiempoRespuesta;
	}
}
