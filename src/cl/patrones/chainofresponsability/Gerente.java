package cl.patrones.chainofresponsability;

public class Gerente implements IAprobador {

	private IAprobador next;

	@Override
	public void solicitudPrestamo(int monto) {
		if(monto > 50000 && monto <= 10000){
			System.out.println("Lo manejo yo, el gerente");
		}else{
			next.solicitudPrestamo(monto);
		}
	}
	
	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}

	@Override
	public IAprobador getNtext() {
		return next;
	}
}
