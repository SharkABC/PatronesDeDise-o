package cl.patrones.factorymethod;

public class Equilatero extends Triangulo {

	public Equilatero(int ladoA, int ladoB, int ladoC) {
		super(ladoA, ladoB, ladoC);
	}

	public String getDescripcion() {
		return "Soy un Triangulo Equilatero";
	}

	public double getSuperficie() {
		// Aca iria el algoritmo para calcular superficie de un traiangulo
		return 0;
	}

	public void dibujate() {
		// Aca iria el algoritmo para dibujar un triangulo equilatero
	}
}
