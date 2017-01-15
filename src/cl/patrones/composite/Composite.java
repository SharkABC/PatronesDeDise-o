package cl.patrones.composite;

import java.util.ArrayList;

/*
 * Permite obtener el sueldo de todos los empleados agregados
 * Permite agregar un empleado a la lista
 * 
 */
public class Composite implements ISueldo {

	private ArrayList<ISueldo> empleados = new ArrayList<ISueldo>();

	public double getSueldo() {
		double sumador = 0;
		
		for(int i = 0; i < empleados.size(); i++){
			sumador = sumador + empleados.get(i).getSueldo();
		}
		return sumador;
	}
	
	public void agrega(ISueldo p){
		empleados.add(p);
	}
	
	public ISueldo getChild(){
		return null;
	}
	
	public void remove(ISueldo sueldo){
		empleados.remove(sueldo);
	}
}
