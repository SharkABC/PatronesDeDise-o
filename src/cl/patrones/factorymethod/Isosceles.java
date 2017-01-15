package cl.patrones.factorymethod;

public class Isosceles extends Triangulo {

	public Isosceles(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	public String getDescripcion() {
		return "Soy un Triangulo Isosceles";
	}

	public double getSuperficie() {
		// Aca iria el algoritmo para calcular superficie de un traiangulo
		return 0;
	}

	public void dibujate() {
		// Aca iria el algoritmo para dibujar un triangulo equilatero
	}
}
