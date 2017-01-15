package cl.patrones.abstractfactory;

/*
 * Soporta multiples estandares que vienen definicos por las diferentes
 * jerarquias de herencia de objetos. Es similar al Factory Method, solo
 * que esta orientado a combinar productos.
 * 
 * Se oculta a los clientes las clases de implementacion: los clientes
 * manipulasn los objetos a traves delas interfaces o clases abstractas-
 * 
 * Facilita el intercambio de familias de productos: al crear una familia
 * completa de ojetos con una factoria abstracta es facil cambiar toda la
 * familia de una vez simplementa cmabiando la factoria concreta.
 * 
 * Mejora la consistencia entre productos: el uso de la factoria abstracta
 * permite forzar a utilizar un conjunto de objetos de una misma familia.
 * 
 * Como inconveniente podemos decir que no seiempre es facil soportar nuevos
 * tipos de productos si se tiene que extender la interfaz de la Factoria
 * abstracta.
 * 
 */

public class Main {
	
	public static void main(String[] args) {
		
		//Probando el factory LCD + Azul
		//La factoria concreta se encarga de decidir el tipo de TV y color
		//El constructor del ensamblaje invoca los metodos del factory para
		//crear el color, TV, y colorearlo
		TVAbstractFactory factory1 = new FactoryLCDAzul();
		EnsamblajeTV ensamblaje1 = new EnsamblajeTV(factory1);
		
		//Probando el factory Plasma + Amarillo
		TVAbstractFactory factory2 = new FactoryPlasmaAmarillo();
		EnsamblajeTV ensamblaje2 = new EnsamblajeTV(factory2);
	}
}
