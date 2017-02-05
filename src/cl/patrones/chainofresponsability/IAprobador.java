package cl.patrones.chainofresponsability;

public interface IAprobador {
	
	public void setNext(IAprobador aprobador);
	public IAprobador getNtext();
	public void solicitudPrestamo(int monto);

}
