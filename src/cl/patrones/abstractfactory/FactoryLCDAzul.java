package cl.patrones.abstractfactory;

public class FactoryLCDAzul extends TVAbstractFactory {

	public TV createTV() {
		return new LCD();
	}
	
	public Color createColor() {
		return new Azul();
	}
}
