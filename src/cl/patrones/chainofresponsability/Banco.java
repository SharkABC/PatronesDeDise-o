package cl.patrones.chainofresponsability;

// Bando organiza la cadena.
public class Banco implements IAprobador{

	private IAprobador next;
	
	@Override
	public void solicitudPrestamo(int monto){
		
		//1- Ejecutivo
		EjecutivoDeCuenta ejecutivo = new EjecutivoDeCuenta();
		this.setNext(ejecutivo);
		
		//2- Lider
		LiderTeamEjecutivo lider = new LiderTeamEjecutivo();
		ejecutivo.setNext(lider);
		
		//3- Gerente
		Gerente gerente = new Gerente();
		lider.setNext(gerente);
		
		//4- Director
		Director director = new Director();
		gerente.setNext(director);
		
		//Primera invocacion a 1- Ejecutivo
		next.solicitudPrestamo(monto);
	}
	
	@Override
	public IAprobador getNtext() {
		return next;
	}

	@Override
	public void setNext(IAprobador aprobador) {
		next = aprobador;
	}

}
