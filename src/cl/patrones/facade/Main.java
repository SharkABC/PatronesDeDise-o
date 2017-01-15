package cl.patrones.facade;

/*
 * Busca simplificar el sistema desde el punto de vista del cliente
 * proporcionando una interfaz unificada para un conjunto de subsistemas,
 * definiendo una interfaz de nivel mas alto. Esto hace que el sistema
 * sea mas facil de usar.
 * 
 * Este patron busca reducir el minimo de comunicacion y dependencias entre
 * subsistemas. Para ello, utilizaremos una fachada, simplificando la 
 * complejidad del cliente. El cliente deberia acceder a un subsistema a 
 * traves del Facade. De esta manera, se estructura un entorno de programacion
 * mas sencillo, al menos desde el punto de vista del cliente.
 * 
 * 
 * Dos llamadas al Facade, el primero debe conocer muchos detalles
 * de los subsistemas y el segundo no.
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		Persona p = new Persona();
		
		Persona.Cliente c = p.new Cliente();
		Persona.Interesado i = p.new Interesado();
		
		//Primer Cliente
		Inmobiliaria inmobiliaria = new Inmobiliaria();
		inmobiliaria.atencionCliente(c);
		inmobiliaria.atencionInteresado(i);
		
		//1
		MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
		muestraPropiedad.mostraPropiedad(123);
		
		//2
		VentaInmueble venta = new VentaInmueble();
		venta.gestionaVenta();
		
		//3
		AdministracionAlquiler alquiler = new AdministracionAlquiler();
		alquiler.cobro(1200);
		
		//3
		CuentasAPagar cuentasAPagar = new CuentasAPagar();
		cuentasAPagar.pagoPropietario(1100);
		
		
		// Segundo Cliente (lo mismo pero usando el Facade)
		Inmobiliaria inmobiliaria2 = new Inmobiliaria();
		inmobiliaria2.atencion(i);
		inmobiliaria2.atencion(c);
		inmobiliaria2.mostraPropiedad(123);
		inmobiliaria2.gestionaVenta();
		inmobiliaria2.cobraAlquiler(123);
		inmobiliaria2.paga(100);
	}
}
