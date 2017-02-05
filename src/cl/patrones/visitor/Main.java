package cl.patrones.visitor;

/*
 * Busca separar un algoritmo (Visitor IVA) de la estructura de un objeto 
 * (Visitable Producto). 
 * La operación se implementa de forma que no se modifique el código de las
 * clases sobre las que opera.
 * Si un objeto es el responsable de mantener un cierto tipo de información,
 * entonces es lógico asignarle también la responsabilidad de realizar todas 
 * las operaciones necesarias sobre esa información. La operación se define 
 * en cada una de las clases que representan los posibles tipos sobre los que 
 * se aplica dicha operación, y por medio del polimorfismo y la vinculación 
 * dinámica se elige en tiempo de ejecución qué versión de la operación se 
 * debe ejecutar. De esta forma se evita un análisis de casos sobre el tipo 
 * del parámetro.
 * 
 * - Una estructura de objetos contiene muchas clases de objetos con distintas 
 * interfaces y se desea llevar a cabo operaciones sobre estos objetos que son 
 * distintas en cada clase concreta.
 * - Se quieren llevar a cabo muchas operaciones dispares sobre objetos de una 
 * estructura de objetos sin tener que incluir dichas operaciones en las clases.
 * - Las clases que definen la estructura de objetos no cambian, pero las 
 * operaciones que se llevan a cabo sobre ellas.
 * 
 * Se debe utilizar este patrón si se quiere realizar un cierto número
 * de operaciones, que no están relacionadas entre sí, sobre instancias
 * de un conjunto de clases, y no se quiere “contaminar” a dichas clases (Visitable).
 * 
 * - Facilita la inclusión de nuevas operaciones.
 * - Agrupa las operaciones relacionadas entre sí.
 * - La inclusión de nuevos ElementsConcretos es una operación costosa.
 * - Posibilita visitar distintas jerarquías de objetos u objetos no relacionados por un padre común.
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		ProductoDescuento producto1 = new ProductoDescuento();
		producto1.setPrecio(100);

		ProductoNormal producto2 = new ProductoNormal();
		producto2.setPrecio(100);
		
		IVA iva = new IVA();
		double resultado1 = producto1.accept(iva);
		double resultado2 = producto2.accept(iva);
		
		System.out.println(resultado1);
		System.out.println(resultado2);
	}

}
