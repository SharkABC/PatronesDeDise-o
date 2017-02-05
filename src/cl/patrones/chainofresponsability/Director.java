package cl.patrones.chainofresponsability;

public class Director implements IAprobador{

	private IAprobador next;

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto >= 10000){
			System.out.println("Lo manejo yo, el director");
		}
	}

	@Override
	public void setNext(IAprobador next) {
		this.next = next;
	}

	@Override
	public IAprobador getNtext() {
		return next;
	}
}
