package cl.patrones.abstractfactory;

public class FactoryPlasmaAmarillo extends TVAbstractFactory {

	public TV createTV() {
		return new Plasma();
	}

	public Color createColor() {
		return new Amarillo();
	}
}
