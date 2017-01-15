package cl.patrones.bridge;

public class Circulo extends Forma {

	private double coordenadaX;
	private double coordenadaY;
	private double coordenadaR;
	
	public Circulo(Dibujo d, double x, double y, double r){
		super(d);
		coordenadaX = x;
		coordenadaY = y;
		coordenadaR = r;
	}

	@Override
	public void dibuja() {
		dibujaCirculo(coordenadaX, coordenadaY, coordenadaR);
	}
}
