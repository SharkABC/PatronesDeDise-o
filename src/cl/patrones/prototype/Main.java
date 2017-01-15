package cl.patrones.prototype;

/*
 * Permite crear objetos prediseñados sin conocer detalles de como crearlos.
 * Esto se logra especificando los prototipos de objetos a crear.
 * Los nuevos objetos que se crearan de los prototipos, en realizar, son clonados.
 * Mejora en performance al clonar objetos.
 * Debe usarse cuando un sistema posea objetos con datos repetitivos en cuanto a atributos.
 * 
 * Client operation() -> Prototype clone() <|= PrototipoConcreto1 clone(), PrototipoConcreto2 clone()
 * 
 */
public class Main {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		TVPrototype tvp = new TVPrototype();
		
		TV tv = (TV) tvp.prototipo("Plasma");
		
		System.out.println(tv.getMarca());
		System.out.println(tv.getPulgadas());
		System.out.println(tv.getColor());
		System.out.println(tv.getPrecio());

		if(tv instanceof Plasma){
			System.out.println(((Plasma)tv).getTiempoRespuesta());
			System.out.println(((Plasma)tv).getAnguloVision());
		}
	}
}
