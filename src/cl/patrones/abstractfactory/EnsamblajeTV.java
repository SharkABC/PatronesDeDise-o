package cl.patrones.abstractfactory;

public class EnsamblajeTV {

	public EnsamblajeTV(TVAbstractFactory factory){
		Color color = factory.createColor();
		TV tv = factory.createTV();
		color.colorea(tv);
	}
}
