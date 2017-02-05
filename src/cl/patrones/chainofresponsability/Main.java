package cl.patrones.chainofresponsability;

/*
 * * Permite establecer una cadena de objetos receptores a través de 
 * los cuales se pasa una petición formulada por un objeto emisor. La idea es 
 * que cualquiera de los receptores pueden responder a la petición en función 
 * de un criterio establecido. Encadena los objetos receptores y pasa la petición 
 * a través de la cadena hasta que es procesada por algún objeto.
 * Busca evitar un montón de if – else largos y complejos en nuestro código, pero 
 * sobre todas las cosas busca evitar que el cliente necesite conocer toda nuestra 
 * estructura jeráquica y que rol cumple cada integrante de nuestra estructura.
 * En múltiples ocasiones, un cliente necesita que se realice una función, pero o 
 * no conoce al servidor concreto de esa función o es conveniente que no lo conozca 
 * para evitar un gran acoplamiento entre ambos.
 * 
 * - Las peticiones emitidas por un objeto deben ser atendidas por distintos objetos receptores.
 * - No se sabe a priori cual es el objeto que me puede resolver el problema.
 * - Cuando un pedido debe ser manejado por varios objetos.
 * - El conjunto de objetos que pueden tratar una petición debería ser especificado dinámicamente.
 */
 
public class Main {

	public static void main(String[] args) {
		//Desde el punto de vista del cliente es muy sencillo
		Banco banco = new Banco();
		banco.solicitudPrestamo(56000);
	}
}
