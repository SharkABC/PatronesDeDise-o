package cl.patrones.bridge;

public class DibujandoGrueso extends Dibujo {

	@Override
	public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
		System.out.println("Dibujando un rectangulo grueso...");
	}

	@Override
	public void dibujaCirculo(double x, double y, double r) {
		System.out.println("Dibujando un circulo grueso...");
	}

	@Override
	public void dibujaTriangulo(double ladoA, double ladoB, double ladoC) {
		System.out.println("Dibujando un triangulo grueso");
	}
}
