package cl.patrones.todo;

import java.util.HashMap;
import java.util.Map;

public class PlataformaPrototype {
	
	public static String PLAYSTATION = "PLAYSTATION";
	public static String XBOX = "XBOX";
	
	private Map<String, Plataforma> prototipos = new HashMap<String, Plataforma>();
	
	public PlataformaPrototype(){
		PlayStation playstation = new PlayStation("PlayStation", "Pro", "Negro");
		Xbox xbox = new Xbox("Xbox", "One", "Pequeño");
		
		prototipos.put(PLAYSTATION, playstation);
		prototipos.put(XBOX, xbox);
	}
	
	public Object getPrototipo(String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).clone();
	}
}
