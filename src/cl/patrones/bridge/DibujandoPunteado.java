package cl.patrones.bridge;

/*
 * Obviamente estas clases no debería realizar una simple salida por consola 
 * sino que debería poseer el algoritmo del dibujo, pero nos sirve a modo de ejemplo.
 * 
 */
public class DibujandoPunteado extends Dibujo {

	public void dibujaRectangulo(double x1, double y1, double x2, double y2) {
		System.out.println("Dibujando un rectangulo punteado...");
	}

	public void dibujaCirculo(double x, double y, double r) {
		System.out.println("Dibujando un circulo punteado...");
	}

	public void dibujaTriangulo(double ladoA, double ladoB, double ladoC) {
		System.out.println("Dibujando un triangulo punteado...");
	}
}
