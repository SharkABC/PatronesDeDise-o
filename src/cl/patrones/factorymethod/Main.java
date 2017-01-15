package cl.patrones.factorymethod;

/*
 * Define la interfaz de creacion de un cierto tipo de objeto,
 * permitiendo que las sibclases decidan que clase concreta necesitan
 * instancias.
 * 
 * Elimina la necesidad de introducir clases especificas en el codigo
 * del creador. Solo maneja la interfaz Product, por lo que permite 
 * añadir cualquier clase ConcretProduct definica por el usuario.
 * 
 * Un metodo factoria puede dar una implementacion por defecto
 * 
 * Factory: Clase que intenta liviar la carga de crear un objeto
 * de manera correcta por el cliente.
 * 
 * Product <|-- ProductoConcreto <--- ConcreteCreator --|> Creator
 * Triangulo    Equilatero            TrianguloFacvtory    TrianguloFactoryMethod
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		
		TrianguloFactoryMethod factory = new TrianguloFactory();
		Triangulo triangulo = factory.createTriangulo(10, 10, 10);
		System.out.println("triangulo: " + triangulo.getDescripcion());
	}
}
