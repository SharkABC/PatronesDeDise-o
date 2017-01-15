package cl.patrones.adapter;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
	
	public static void main(String[] args) {
		
		PersonaVieja personaVieja = new PersonaVieja();
		personaVieja.setApellido("Perez");
		personaVieja.setNombre("Maxi");
		
		// Seteamos que nacio en el anio 2000
		GregorianCalendar g = new GregorianCalendar();
		g.set(2000, 01, 01);
		
		Date d = g.getTime();
		personaVieja.setFechaDeNacimiento(d);
		// Hasta aqui creamos una PersonVieja como se hacia antes

		// Ahora veremos como funciona el adapter
		ViejaToNuevaAdapter personaNueva = new ViejaToNuevaAdapter(personaVieja);
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
		
		personaNueva.setEdad(10);
		personaNueva.setNombre("Juan Perez");
		
		System.out.println(personaNueva.getEdad());
		System.out.println(personaNueva.getNombre());
	}
}
