package cl.patrones.builder;

/*
 * ConcreteBuilders los encargados de colocarle la
 * logica de construcción de cada Auto en particular
 * 
 */
public class FiatBuilder extends AutoBuilder {
	
	public void buildMarca(){
		auto.setMarca("Fiat");
	}
	
	public void buildModelo() {
		auto.setModelo("Palio");
	}
	
	public void buildMotor() {
		Motor motor = new Motor();
		motor.setNumero(232323);
		motor.setPotencia("23 HP");
		auto.setMotor(motor);
	}

	public void buildPuertas() {
		auto.setCantidadDePuertas(2);
	}
}
