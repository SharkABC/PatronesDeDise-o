package cl.patrones.builder;

/*
 * El Builder define al menos dos cosas: un método para devolver
 * el Producto (el auto en nuestro caso) y los métodos necesarios 
 * para la construcción del mismo.
 * 
 */
public abstract class AutoBuilder {
	
	protected Auto auto;
	
	//Devolver el producto
	public Auto getAuto(){
		return auto;
	}
	
	//Crear el producto
	public void crearAuto(){
		auto = new Auto();
	}
	
	public abstract void buildMotor();
	
	public abstract void buildModelo();
	
	public abstract void buildMarca();
	
	public abstract void buildPuertas();

}
