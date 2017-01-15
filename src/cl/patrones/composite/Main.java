package cl.patrones.composite;

/*
 * Permite construir objetos complejos componiento de forma
 * recursiva objetos similares en una estructura de arbol.
 * Esto simplifica el tratamiento de los objetos creados, ya
 * que al poseer todos ellos una interfaz comun, se tratan todos
 * de la misma manera.
 * 
 * Define jerarquias entre clases
 * Simplifica la interaccion de los clientes
 * Hace mas facil la insercion de nuevos hijos
 * Hace el diseño mas general
 * Si la operacion es compleja, puede ensuciar mucho el codigo
 * y hacerlo ilegible.
 * 
 * Un Banco esta compuesto de muchas areas los cuales tienen muchos empleados
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		Banco banco = new Banco();
		Gerencia gerencia = new Gerencia();
		SectorCajas cajas = new SectorCajas();
		
		banco.agrega(cajas);
		banco.agrega(gerencia);
		
		Empleado cajero1 = new Empleado("Juan Perez", "Cajero", 2000);
		Empleado cajero2 = new Empleado("Perico Perez", "Cajero", 2000);
		cajas.agrega(cajero1);
		cajas.agrega(cajero2);
		
		Empleado gerente = new Empleado("Soy Groso", "Gerente", 5000);
		gerencia.agrega(gerente);
		
		System.out.println("Sueldo empleado Cajas: " + cajas.getSueldo());
		System.out.println("Sueldo gerente Cajas: " + gerencia.getSueldo());
		System.out.println("Sueldo total Banco:" + banco.getSueldo());
	}
}
