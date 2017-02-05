package cl.patrones.command;

/*
 * Encapsula un mensaje como un objeto. Especifica una 
 * forma simple de separar la ejecución de un comando, 
 * del entorno que generó dicho comando. Permite solicitar 
 * una operación a un objeto sin conocer el contenido ni el 
 * receptor real de la misma. Si bien estas definiciones 
 * parecen un tanto ambigüas, sería oportuno volver a leerlas 
 * luego de entender el ejemplo.
 * 
 * Este patrón suele establecer en escenarios donde se necesite 
 * encapsular una petición dentro de un objeto, permitiendo 
 * parametrizar a los clientes con distintas peticiones, encolarlas, 
 * guardarlas en un registro de sucesos o implementar un mecanismo 
 * de deshacer/repetir.
 * 
 * Se debe usar cuando:
 * - Se necesiten colas o registros de mensajes.
 * - Se deba tener la posibilidad de deshacer las operaciones 
 *  realizadas.
 * - Se necesite uniformidad al invocar las acciones.
 * - Se quiera facilitar la parametrización de las acciones a 
 *  realizar.
 * - Se quiera independizar el momento de petición del de ejecución.
 * - El parámetro de una orden puede ser otra orden a ejecutar.
 * - Se busque desarrollar sistemas utilizando órdenes de alto nivel 
 *  que se construyen con operaciones sencillas (primitivas).
 * - Se necesite sencillez al extender el sistema con nuevas acciones.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		
		Command command = new PrendeServer(new ChileServer());
		Invoker serverAdmin = new Invoker(command);
		serverAdmin.run();
	}

}
