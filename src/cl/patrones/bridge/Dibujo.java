package cl.patrones.bridge;

public abstract class Dibujo {

	public abstract void dibujaRectangulo(double x1, double y1, double x2, double y2);
	public abstract void dibujaCirculo(double x, double y, double r);
	public abstract void dibujaTriangulo(double ladoA, double ladoB, double ladoC);
}
