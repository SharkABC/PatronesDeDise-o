package cl.patrones.observer;

/*
 * Este patrón de diseño permite reaccionar a ciertas clases llamadas 
 * observadores sobre un evento determinado.
 * 
 * Es usado en programación para monitorear el estado de un objeto en 
 * un programa. 
 * 
 * Está relacionado con el principio de invocación implícita. La motivación
 * principal de este patrón es su utilización como un sistema de detección 
 * de eventos en tiempo de ejecución. Es una característica muy interesante
 * en términos del desarrollo de aplicaciones en tiempo real.
 * 
 * - Un objeto necesita notificar a otros objetos cuando cambia su estado. 
 *  La idea es encapsular estos aspectos en objetos diferentes permite 
 *  variarlos y reutilizarlos independientemente.
 *  
 * - Cuando existe una relación de dependencia de uno a muchos que puede 
 *  requerir que un objeto notifique a múltiples objetos que dependen de él 
 *  cuando cambia su estado.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		AlarmaLibro a = new AlarmaLibro();
		a.attach(new Compras());
		a.attach(new Administracion());
		a.attach(new Stock());
		
		Libro libro = new Libro();
		libro.setEstado("MALO");
		
		Biblioteca b = new Biblioteca();
		b.devuelveLibro(libro);
	}
}
