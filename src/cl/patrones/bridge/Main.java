package cl.patrones.bridge;

/*
 * Desacopla una abstraccion (Forma) de su implementacion (Dibujo)
 * 
 * Un objeto (Triangulo), muchas implementaciones posibles (DibujandoNormal...)
 * 
 * Permite modificar las implementaciones de una abstraccion en tiempo 
 * de ejecucion. Basicamente es una tecnica usada en programacion para
 * desacoplar la interface de una clase de su implementacion, de manera
 * que ambas puedas ser modificadas independientemente sin necesidad e 
 * alterar por ello la otra.
 * 
 * Evita un enlace permanente entre la abstraccion y su implementacion.
 * Esto puede ser debido a que la implementacion debe ser seleccionada
 * o cambiada en tiempo de ejecucion.
 * 
 * Tanto las abstracciones como sus implementaciones deben ser extensibles
 * por medio de subclases. El patron Bridge permite combinar abstracciones
 * e implementaciones diferentes y extenderlas independientemente.
 * 
 * Cambios en la implementacion de una abstraccion no deben impactar en los
 * clientes, es decir, su codigo no debe terner que ser recompilado.
 * 
 * Se desea compartir una mplementacion entre multiples y este hecho debe
 * ser escondido a los clientes
 * 
 * Permite simplificar jerarquias demasiado pobladas.
 * 
 */
public class Main {

	public static void main(String[] args) {
		
		Rectangulo rectangulo = new Rectangulo(new DibujandoPunteado(), 1, 1, 2, 2);
		rectangulo.dibuja();
		
		Circulo circulo = new Circulo(new DibujandoNormal(), 2, 2, 3);
		circulo.dibuja();
		
		Triangulo triangulo = new Triangulo(new DibujandoGrueso(), 1, 2, 3);
		triangulo.dibuja();
	}
}
