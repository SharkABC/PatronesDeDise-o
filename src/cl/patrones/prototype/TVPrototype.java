package cl.patrones.prototype;

import java.util.HashMap;
import java.util.Map;

public class TVPrototype {
	
	private Map<String, TV> prototipos = new HashMap<String, TV>();
	
	public TVPrototype(){
		Plasma plasma = new Plasma("Sony", 21, "Plateado", 399.99, 90, 0.05);
		LCD lcd = new LCD("Panasonic", 42, "Negro", 599.99, 290);
		
		// ACLARACION IMPORTANTE!!
		// Aca he hardcodeado los dos tipos de TVs para una facil visualizacion
		// Lo ideal seria crear 2 metodos para agregar / remover prototipos
		// del Map dinamicamente
		
		prototipos.put("Plasma", plasma);
		prototipos.put("LCD", lcd);
	}
	
	public Object prototipo(String tipo) throws CloneNotSupportedException{
		return prototipos.get(tipo).clone();
	}
}
