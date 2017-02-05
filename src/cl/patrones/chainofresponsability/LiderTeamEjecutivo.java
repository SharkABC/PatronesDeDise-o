package cl.patrones.chainofresponsability;

public class LiderTeamEjecutivo implements IAprobador {

	private IAprobador next;
	
	@Override
	public void solicitudPrestamo(int monto) {
		if(monto > 10000 && monto <=50000){
			System.out.println("Lo manejo yo, el lider");
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
