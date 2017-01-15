package cl.patrones.builder;

/*
 * Permite crear un objeto complejo, a partir de una variedad
 * de partes que contribuyen individualmente a la creacion
 * y ensamblacion del objeto mencionado.
 * 
 * Centraliza el proceso de creacion en un unico punto, de tal 
 * forma que el mismo proceso de construccion pueda crear 
 * representaciones diferentes.
 * 
 * Director <>-> Builder <- ConcreteBuilder --> Producto
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		AutoDirector director = new AutoDirector();
		
		//Se envia el auto a construir
		director.setAutoBuilder(new FordBuilder());
		
		//Se crea el auto
		director.constructAuto();
		
		//Se obtiene el auto
		Auto auto = director.getAutoBuilder();
		
		System.out.println(auto.getMarca());
		System.out.println(auto.getModelo());
	}
}
