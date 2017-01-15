package cl.patrones.bridge;

public class Triangulo extends Forma{

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Triangulo(Dibujo d, double ladoA, double ladoB, double ladoC) {
		super(d);
		setLadoA(ladoA);
		setLadoB(ladoB);
		setLadoC(ladoC);
	}
	
	@Override
	public void dibuja() {
		dibujaTriangulo(ladoA, ladoB, ladoC);
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
}
