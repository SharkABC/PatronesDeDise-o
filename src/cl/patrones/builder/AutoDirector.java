package cl.patrones.builder;

/*
 * Se envia el tipo de auto a construir (Ford, Fiat, etc).
 * Luego, al llamar al metodo constructAuto(); la construccion
 * se realizara de manera automatica
 * 
 */
public class AutoDirector {
	// No es necesario que exista la palabra Director
	// Esta clase podria llamarse Concesionaria, Garage, FabricaDeAutos
	
	private AutoBuilder autoBuilder;
	
	public void constructAuto() {
		autoBuilder.crearAuto();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildMotor();
		autoBuilder.buildPuertas();
	}

	public Auto getAutoBuilder() {
		return autoBuilder.getAuto();
	}

	public void setAutoBuilder(AutoBuilder autoBuilder) {
		this.autoBuilder = autoBuilder;
	}
}
