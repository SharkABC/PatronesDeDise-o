package cl.patrones.proxy;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		GuardarDatos disco = new GuardarDatos();
		
		ArrayList lista = new ArrayList();
		lista.add("A");
		disco.save(lista);
		
		ConnectionManager.conectate();
		
		lista.add("B");
		lista.add("C");
		disco.save(lista);
	}
}
